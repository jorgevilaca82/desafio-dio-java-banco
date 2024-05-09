import java.util.Optional;

public class BancoService {
    public void criaContaCorrenteParaCliente(Cliente cliente, Agencia agencia) {

        ContaCorrente contaCorrente = new ContaCorrente(agencia, 0D);

        cliente.setConta(Optional.of(contaCorrente));
    }

    public void criaContaPoupancaParaCliente(Cliente cliente, Agencia agencia) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(agencia, 0D);

        cliente.setConta(Optional.of(contaPoupanca));
    }
}
