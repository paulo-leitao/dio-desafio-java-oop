// import java.util.ArrayList;
// import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = Banco.getBanco();

        banco.setNome("Meu Banco");

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        paulo.setCpf("02214534341");

        Cliente maria = new Cliente();
        paulo.setNome("Maria");
        paulo.setCpf("11111111111");

        Conta cc = new ContaCorrente(paulo);
        ContaPoupanca poupanca = new ContaPoupanca(paulo);
        ContaCorrente ccMaria = new ContaCorrente(maria);

        // System.out.println(String.valueOf(banco.getContas()));

        
        poupanca.cadastrarChavePix("email", "paulo.sales@outlook.com");
        cc.cadastrarChavePix("email", "paulo.sales@outlook.com");
        
        cc.impprimirDados();
        poupanca.impprimirDados();
        ccMaria.impprimirDados();
        
        ccMaria.cadastrarChavePix("email", "paulo.sales@outlook.com");
        
        cc.depositar(1000);
        cc.sacar(300);
        cc.transferir(500, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cartao cartao = new Cartao(paulo);
        cartao.impprimirDados();

    }
}