public class Cartao implements IGeradorCartao, IServicos{

  protected long numero;
  protected Cliente cliente;
  protected String validade;
  private int cv;

  public Cartao(Cliente cliente){
    this.cliente = cliente;
    this.numero = gerarNumero();
    this.cv = gerarNumero(1,999);
    this.validade = gerarData();
  }
  
  public long getNumero() {
    return numero;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public String getValidade() {
    return validade;
  }

  public int getCv() {
    return cv;
  }

  @Override
  public void impprimirDados() {
    System.out.println("=== Dados do Cartão de Crédito ===");
    System.out.println(String.format("Titular: %s", cliente.nome));
    System.out.println(String.format("Numero: %d", numero));
    System.out.println(String.format("Validade: %s", validade));
    System.out.println(String.format("CV: %d", cv));
    System.out.println("=========================\n");
  }
}
