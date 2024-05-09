import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

    private Agencia agencia;
    private Integer numero;
    private Double saldo;
    private ContaTipo contaTipo;

    private List<ContaMovimentacao> movimentacoes;

    public Conta(ContaTipo contaTipo, Agencia agencia, Integer numero, Double saldo) {
        this.contaTipo = contaTipo;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo != null ? saldo : 0D;
        this.movimentacoes = new ArrayList<>();
    }

    public ContaTipo getContaTipo() {
        return contaTipo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private void realizarDeposito(Double valor) {
        if (valor < 0L)
            throw new RuntimeException("Não se pode depositar valores negativos");

        this.setSaldo(valor + this.saldo);
    }

    public void depositar(Double valor) throws Exception {
        this.realizarDeposito(valor);
        this.logMovimentacao(ContaMovimentacao.deposito(valor));
    }

    public void depositar(Double valor, Conta origem) throws Exception {
        this.realizarDeposito(valor);
        this.logMovimentacao(ContaMovimentacao.deposito(valor, origem));
    }

    private void logMovimentacao(ContaMovimentacao movimentacao) {
        this.movimentacoes.add(movimentacao);
    }

    private void realizarSaque(Double valor) throws RuntimeException {
        if (valor < 0L)
            throw new RuntimeException("Não se pode sacar valores negativos");

        if (valor > this.getSaldo())
            throw new SaldoInsuficienteException("Saldo insuficiente");

        this.setSaldo(this.saldo - valor);

    }

    public void sacar(Double valor) throws RuntimeException {
        this.realizarSaque(valor);
        this.logMovimentacao(ContaMovimentacao.saque(valor));
    }

    private void realizarTransferencia(Double valor, Conta destino) {
        try {
            this.realizarSaque(valor);
            destino.depositar(valor, this);
        } catch (SaldoInsuficienteException saldoInsuficienteException) {
            System.out.println(saldoInsuficienteException);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void transferir(Double valor, Conta destino) {
        this.realizarTransferencia(valor, destino);
        this.logMovimentacao(ContaMovimentacao.transferencia(valor, destino));
    }

    public List<ContaMovimentacao> gContaMovimentacaos() {
        return this.movimentacoes;
    }
}
