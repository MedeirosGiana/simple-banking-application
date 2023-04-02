public class AccountCurrent extends Account {

    public AccountCurrent (Client cliente){
        super(cliente);
    }

    @Override
    public void menu() {
        System.out.println("\tEscolha a opção desejada:");
        exibirMenu();

    }
    @Override
    public void extrato() {
        System.out.println("===== Extrato Conta Corrente =====");
        imprimirInformacoesExtrato();
    }

    @Override
    public void escolherOpcao(int opcao) {

    }


}
