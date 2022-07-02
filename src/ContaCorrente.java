public class ContaCorrente extends Conta {
  
  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("*** Extrato Conta-Corrente ***");
    extrato();
  }

  @Override
  public void impprimirDados() {
    System.out.println("===   Conta-Corrente   ===");
    infosComuns();
    if (chavePixCpf != null){
      System.out.println(String.format("Chave Pix: %s", chavePixCpf));
    }
    if (chavePixEmail != null){
      System.out.println(String.format("Chave Pix: %s", chavePixEmail));
    }
    if (chavePixTelefone != null){
      System.out.println(String.format("Chave Pix: %s", chavePixTelefone));
    }
    System.out.println("=========================\n");

  }

  
}
