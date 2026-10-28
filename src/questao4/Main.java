package questao4;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

        Produto papel = new Produto(1, "Papel", "Papelaria", 0.50);
        Produto borracha = new Produto(2, "Borracha", "Papelaria", 1.00);
        Produto xadrez = new Produto(11, "Xadrez", "Jogo", 20.00);
        Produto monopoly = new Produto(12, "Monopoly", "Jogo", 25.00);
        Produto unmatched = new Produto(13, "Unmatched", "Jogo", 110.00);
        Produto hobbit = new Produto(21, "O Hobbit", "Livro", 40.00);
        Produto etica = new Produto(22, "Ética a Nicômaco", "Livro", 37.00);
        Collections.addAll(produtos,papel,borracha,xadrez,unmatched,monopoly, hobbit, etica);

        Cliente jose = new Cliente(101, "Jose");
        Cliente maria = new Cliente(102, "Maria");
        Collections.addAll(clientes,jose,maria);

        Pedido pedido1= new Pedido(1001, LocalDate.of(2026,10,25), produtos, maria);
        Pedido pedido2= new Pedido(1002, LocalDate.of(2026,10,26), produtos, jose);
        Pedido pedido3= new Pedido(1003, LocalDate.of(2026,10,2), produtos, maria);
        Pedido pedido4= new Pedido(1004, LocalDate.of(2026,10,30), produtos, jose);
        Collections.addAll(pedidos,pedido1,pedido2,pedido3,pedido4);


        //QUESTÃO 4____________________________________________________________________________________________
        Map<Cliente, Pedido> pedidosRecentes = pedidos.stream()
                .collect(Collectors.toMap(
                        Pedido::getCliente,
                        pedido -> pedido,
                        BinaryOperator.maxBy(Comparator.comparing(Pedido::getData))
                ));
        List<Pedido> pedidosMaisRecentes = new ArrayList<Pedido>(pedidosRecentes.values());

        pedidosMaisRecentes.forEach(p -> System.out.printf("Cliente: %s | Pedido ID: %d | Data: %s%n", p.getCliente().getNome(), p.getId(), p.getData()));
    }
}
