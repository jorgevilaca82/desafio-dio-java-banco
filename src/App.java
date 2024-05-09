import java.text.NumberFormat;
import java.util.List;

public class App {

    static NumberFormat formatter = NumberFormat.getCurrencyInstance();

    static void mostraConta(Conta conta) {
        // Cast
        switch (conta.getContaTipo()) {
            case CONTA_CORRENTE:
                System.out.println((ContaCorrente) conta);

                break;

            case CONTA_POUPANCA:
                System.out.println((ContaPoupanca) conta);

            default:
                break;
        }
    }

    static void mostraSaldo(Conta conta) {
        System.out.println(conta + ": O saldo atual da conta é -> " + formatter.format(conta.getSaldo()));
    }

    static void depositar(Conta conta, Double valor) throws Exception {
        conta.depositar(valor);
        System.out.println(conta + ": Foi realizado um depósito na conta no valor de " + formatter.format(valor));
        mostraSaldo(conta);
    }

    static void sacar(Conta conta, Double valor) {
        conta.sacar(valor);
        System.out.println(conta + ": Foi realizado um saque na conta no valor de " + formatter.format(valor));
        mostraSaldo(conta);
    }

    static void transferir(Conta origem, Conta destino, Double valor) {
        origem.transferir(valor, destino);
        System.out.println("Foi realizado uma transferência: " + origem + " para " + destino + " no valor de " + formatter.format(valor));
        mostraSaldo(origem);
        mostraSaldo(destino);

    }

    public static void main(String[] args) throws Exception {

        Agencia agenciaPrincipal = new Agencia("Principal", 1);

        Cliente cliente1 = new Cliente("Jorge");
        Cliente cliente2 = new Cliente("Luiz");

        BancoService bancoService = new BancoService();
        bancoService.criaContaCorrenteParaCliente(cliente1, agenciaPrincipal);
        bancoService.criaContaCorrenteParaCliente(cliente2, agenciaPrincipal);
        // bancoService.criaContaPoupancaParaCliente(cliente1, agenciaPrincipal, 1000);

        Conta contaCliente1 = cliente1.getConta()
                .orElseThrow(() -> new RuntimeException("Cliente sem conta corrente"));

        Conta contaCliente2 = cliente2.getConta()
                .orElseThrow(() -> new RuntimeException("Cliente sem conta corrente"));

        mostraConta(contaCliente1);
        mostraConta(contaCliente2);

        mostraSaldo(contaCliente1);
        mostraSaldo(contaCliente2);

        depositar(contaCliente1, 1000D);
        depositar(contaCliente2, 1000D);

        sacar(contaCliente1, 50D);
        sacar(contaCliente2, 25D);

        transferir(contaCliente1, contaCliente2, 100D);


        System.out.println("\n---Extrato Conta 1---");
        contaCliente1.gContaMovimentacaos().forEach(System.out::println);

        System.out.println("\n---Extrato Conta 2---");
        contaCliente2.gContaMovimentacaos().forEach(System.out::println);

        System.out.println("---");

    }
}
