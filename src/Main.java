import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Client cliente = new Client();
        cliente.setNome("Giana Medeiros");
        cliente.setCpf("11111111111");


        Account cc = new AccountCurrent(cliente);
        Account cPoupanca = new AccountSavings(cliente) {
            @Override
            public void menu() {
                exibirMenu();
            }
        };

        cPoupanca.exibirMenu();


        cc.depositar(150);
        cc.extrato();
        cc.transferir(50,cPoupanca);
        cc.sacar(30);

        cc.extrato();
        cPoupanca.extrato();

    }
}
