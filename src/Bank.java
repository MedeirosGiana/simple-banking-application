import java.util.List;

public class Bank {

   private String nome;
   private int codIdentificador;
   private List<Account> contas;
   private List<Client> clients;


   public List<Account> getContas() {
      return contas;
   }


   public void setContas(List<Account> contas) {
      this.contas = contas;
   }
   public List<Client> getClients() {
      return clients;
   }
   public void setClients(List<Client> clients) {
      this.clients = clients;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getCodIdentificador() {
      return codIdentificador;
   }

   public void setCodIdentificador(int codIdentificador) {
      this.codIdentificador = codIdentificador;
   }
}
