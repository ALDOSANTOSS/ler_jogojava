public class Main {

    public static void main(String[] args) {
        Cliente aldo = new Cliente();
        aldo.setNome("Aldo");

        Conta cc = new ContaCorrente(aldo);
        Conta poupanca = new ContaPoupanca(aldo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
