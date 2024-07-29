public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, Cliente cliente, double taxaRendimento) {
        super(numero, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        double rendimento = super.consultarSaldo() * taxaRendimento;
        super.depositar(rendimento);
    }
}

