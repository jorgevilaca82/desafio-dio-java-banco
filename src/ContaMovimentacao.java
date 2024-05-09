import java.text.NumberFormat;

public class ContaMovimentacao {

    private static NumberFormat formatter = NumberFormat.getCurrencyInstance();

    private ContaOperacao operacao;
    private Double valor;
    private Conta origem;
    private Conta destino;

    private ContaMovimentacao(ContaOperacao op, Double valor) {
        this.operacao = op;
        this.valor = valor;
    }

    public static ContaMovimentacao saque(Double valor) {
        return new ContaMovimentacao(ContaOperacao.SAQUE, valor);
    }

    public static ContaMovimentacao deposito(Double valor) {
        return new ContaMovimentacao(ContaOperacao.DEPOSITO, valor);
    }

    public static ContaMovimentacao deposito(Double valor, Conta origem) {
        ContaMovimentacao mov = ContaMovimentacao.deposito(valor);
        mov.origem = origem;
        return mov;
    }

    public static ContaMovimentacao transferencia(Double valor, Conta destino) {
        ContaMovimentacao mov = new ContaMovimentacao(ContaOperacao.TRANSFERENCIA, valor);
        mov.destino = destino;
        return mov;
    }

    @Override
    public String toString() {
        return "ContaMovimentacao [operacao=" + operacao + ", valor=" + formatter.format(valor) + ", origem=" + origem
                + ", destino="
                + destino + "]";
    }
}
