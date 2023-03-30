public class Main {
    public static void main(String[] args) {
        Client cliente = new Client();
        cliente.setNome("Giana Medeiros");
        cliente.setCpf("11111111111");
        Account cc = new AccountCurrent(cliente);
        Account cPoupanca = new AccountSavings(cliente);

        cc.depositar(150);
        cc.transferir(50,cPoupanca);

        cc.extrato();
        cPoupanca.extrato();

    }
}
