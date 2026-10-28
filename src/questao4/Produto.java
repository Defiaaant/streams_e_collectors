package questao4;

public class Produto {
    private long id;
    private String nome;
    private String categoria;
    private double preco;

    public Produto(long id, String nome, String categoria, double preco){
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    public String getNome(){return nome;}
    public String getCategoria() {return categoria;}
    public long getId(){return id;}
    public double getPreco() {return preco;}
}
