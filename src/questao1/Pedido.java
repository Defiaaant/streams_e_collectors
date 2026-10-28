package questao1;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private long id;
    private LocalDate dataPedido;
    private List<Produto> produtos;
    private Cliente cliente;


    public Pedido(long id, LocalDate dataPedido, List<Produto> produtos, Cliente cliente){
        this.id = id;
        this.dataPedido = dataPedido;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public long getId(){
        return id;
    }
    public LocalDate getPreco() {return dataPedido;}
    public List<Produto> getProdutos() {return  produtos;}
    public Cliente cliente() {return cliente;}

}
