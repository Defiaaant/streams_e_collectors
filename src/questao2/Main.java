package questao2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

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
        Collections.addAll(pedidos,pedido1,pedido2);

        //QUESTÃO 2____________________________________________________________________________________________
        for (Produto p: produtos){
            if (p.getCategoria().equals("Papelaria")) {
                    System.out.printf("ID: %04d -- Nome: %s -- Categoria: %s -- Preço: R$ %.2f\n", p.getId(), p.getNome(), p.getCategoria(), p.getPreco());
            }
        }
    }
}
