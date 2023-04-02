public interface IAccount {
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Account contaDestino);
     void extrato();
     void exibirMenu();
     void escolherOpcao(int opcao);

}
