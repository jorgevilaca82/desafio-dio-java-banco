import java.util.Optional;

public class Cliente {
    private String nome;
    private Optional<Conta> conta;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<Conta> getConta() {
        return this.conta;
    }

    public void setConta(Optional<Conta> conta) {
        this.conta = conta;
    }

}
