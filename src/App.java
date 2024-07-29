public class App {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("João", "12345678900");
        Cliente cliente2 = new Cliente("Maria", "98765432100");

        ContaCorrente conta1 = new ContaCorrente("001", cliente1, 10.0);
        ContaPoupanca conta2 = new ContaPoupanca("002", cliente2, 0.01);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(1000);
        conta2.depositar(2000);

        conta1.transferir(200, conta2);

        System.out.println("Saldo Conta Corrente: " + conta1.consultarSaldo());
        System.out.println("Saldo Conta Poupança: " + conta2.consultarSaldo());

        conta2.renderJuros();
        System.out.println("Saldo Conta Poupança após render juros: " + conta2.consultarSaldo());
    }
}
