public abstract class Account implements IAccount {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1 ;
    protected int agencia,nConta;
    protected double saldo;
    protected Client cliente;

    public Account(Client cliente){
        this.agencia = Account.AGENCIA_PADRAO;
        this.nConta = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Account contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getnConta() {
        return nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirMenu() {
        System.out.println("\tEscolha a opção desejada: ");
        System.out.println("-1: Consultar extrato ");
        System.out.println("-2: Sacar ");
        System.out.println("-3: Transferir ");
        System.out.println("-4: Sair ");
    }

    protected void imprimirInformacoesExtrato() {

        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Cpf: %s\n", this.cliente.getCpf());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.nConta);
        System.out.printf("Saldo disponivel: %.2f\n", this.saldo);


    }


    public abstract void menu();
}
