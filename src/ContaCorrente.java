public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Agencia agencia, Double saldo) {
        
        super(ContaTipo.CONTA_CORRENTE, agencia, SEQUENCIAL++, saldo);
    }

    @Override
    public String toString() {
        String agencia = String.format("%05d", this.getAgencia().getNumero());
        return "ContaCorrente [Ag: "+ agencia + " Número: " + this.getNumero() + "]";
    }

}
