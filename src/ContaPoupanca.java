public class ContaPoupanca extends Conta{
    
  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("*** Extrato Conta-Poupança ***");
    extrato();
  }

  @Override
  public void impprimirDados() {
    System.out.println("===   Conta-Poupança   ===");
    infosComuns();
    if (chavePixCpf != null){
      System.out.println(String.format("Chave Pix: %s", this.chavePixCpf));
    }
    if (chavePixEmail != null){
      System.out.println(String.format("Chave Pix: %s", this.chavePixEmail));
    }
    if (chavePixTelefone != null){
      System.out.println(String.format("Chave Pix: %d", this.chavePixTelefone));
    }
    System.out.println("=========================\n");
    
  }

}
