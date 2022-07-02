import java.util.List;

public abstract class Conta implements IServicos{
  
  private static final int CODIGO_AGENCIA = 1;

  private static int SEQUENCIAL_ID = 1;

  protected int numero;
  protected int agencia;
  protected double saldo;
  protected Cliente cliente;
  private List<Cartao> cartoes;

  protected String chavePixTelefone;
  protected String chavePixEmail;
  protected String chavePixCpf;

  
  public Conta(Cliente cliente) {
    this.cliente = cliente;
    this.numero = SEQUENCIAL_ID++;
    this.agencia = CODIGO_AGENCIA;
  }
  
  public void sacar(double valor){
    saldo -= valor;
  }

  public void depositar(double valor){
    saldo += valor;
  }

  public void transferir(double valor, Conta contaDestino){
    saldo -= valor;
    contaDestino.depositar(valor);
  }
  
  public void cadastrarChavePix(String tipo, String chave, List<Conta> contas){
    try {
      // boolean hasChavePix;
      switch(tipo){
        case "cpf":
          contas.stream().filter(conta -> (conta.getChavePixCpf()==null)?false:conta.getChavePixCpf().equals(chave)).forEach(System.out::println);
          // this.chavePixCpf = chave;
          break;
        case "email":
        boolean hasChavePix = contas.stream().anyMatch(conta -> (conta.getChavePixEmail()==null)?false:conta.getChavePixEmail().equalsIgnoreCase(chave));
          // contas.stream().filter(conta -> (conta.getChavePixEmail()==null)?false:conta.getChavePixEmail().equals(chave)).forEach(conta -> System.out.println("Chave Pix em uso!"));
          if (hasChavePix){
            System.out.println("Chave Pix em uso!\n");
          } else {
            this.chavePixEmail = chave;
            System.out.println(String.format("Chave '%s' registrada com sucesso!\n", chavePixEmail));
          }
          
          break;
        case "celular":
          contas.stream().filter(conta -> conta.getChavePixTelefone().equals(chave)).forEach(System.out::println);
          break;
        default:
          System.out.println("Informe o tipo da chave 'email', 'cpf' ou 'celular'\n");
      }
        
        
    } catch (Exception e) {
      System.out.println("Exception: "+ e.getMessage());
    }
  }

  public int getNumero() {
    return numero;
  }

  public int getAgencia() {
    return agencia;
  }

  public double getSaldo() {
    return saldo;
  }

  public List<Cartao> getCartoes() {
    return cartoes;
  }

  public void setCartoes(List<Cartao> cartoes) {
    this.cartoes = cartoes;
  }

  public String getChavePixTelefone() {
    return chavePixTelefone;
  }

  public String getChavePixEmail() {
    return chavePixEmail;
  }

  public String getChavePixCpf() {
    return chavePixCpf;
  }

  protected void extrato(){
    System.out.println(String.format("SALDO: %.2f\n",saldo));
  }
  protected void infosComuns(){
    System.out.println("=== Dados Titular ===");
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
    System.out.println("=== Dados Bancários ===");
    System.out.println(String.format("Agencia: %d", agencia));
    System.out.println(String.format("Numero: %d", numero));
  }

}
