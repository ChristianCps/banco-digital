public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(String numero, Cliente cliente, double taxaManutencao) {
        super(numero, cliente);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void descontarTaxa() {
        super.sacar(taxaManutencao);
    }
}

