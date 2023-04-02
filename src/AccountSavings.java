public abstract class AccountSavings extends Account {
    public AccountSavings (Client cliente){

        super(cliente);
    }

    @Override
    public void extrato() {
            System.out.println("===== Extrato Conta Poupanca =====");
            imprimirInformacoesExtrato();

    }

    @Override
    public void escolherOpcao(int opcao) {

    }
}
