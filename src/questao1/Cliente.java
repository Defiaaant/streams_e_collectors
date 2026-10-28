package questao1;

public class Cliente {
    private long id;
    private String nome;

    public Cliente(long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public long getId(){
        return id;
    }
}
