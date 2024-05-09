public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1000;

    public ContaPoupanca(Agencia agencia, Double saldo) {
        super(ContaTipo.CONTA_POUPANCA, agencia, SEQUENCIAL++, saldo);
    }

    @Override
    public String toString() {
        String agencia = String.format("%05d", this.getAgencia().getNumero());
        return "ContaPoupanca [Ag: "+ agencia + " Número: " + this.getNumero() + "]";
    }
}
