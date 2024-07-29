public class Emprestimo {
    private Cliente cliente;
    private double valor;
    private double taxaJuros;
    private int prazo;

    public Emprestimo(Cliente cliente, double valor, double taxaJuros, int prazo) {
        this.cliente = cliente;
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazo = prazo;
    }

    public double calcularValorTotal() {
        return valor + (valor * taxaJuros * prazo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getPrazo() {
        return prazo;
    }
}

