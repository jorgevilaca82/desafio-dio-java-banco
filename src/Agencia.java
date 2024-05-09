
public class Agencia {
    private String nome;
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agencia(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
}
