public class AccountCurrent extends Account {

    public AccountCurrent (Client cliente){
        super(cliente);
    }
    @Override
    public void extrato() {
        System.out.println("===== Extrato Conta Corrente =====");
        imprimirInformacoesExtrato();
    }

}
