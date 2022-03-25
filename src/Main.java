public class Main {
    public static void main(String[] args) {
        Cliente fernanda = new Cliente();
        fernanda.setNome("Fernanda");

        Conta cc = new ContaCorrente(fernanda);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(fernanda);
        cc.transferir(100,poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
