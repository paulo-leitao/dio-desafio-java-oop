import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();

        banco.setNome("Meu Banco");

        List<Conta> contas = new ArrayList<>();
        

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        paulo.setCpf("02214534341");

        Conta cc = new ContaCorrente(paulo);
        ContaPoupanca poupanca = new ContaPoupanca(paulo);

        contas.add(cc);
        contas.add(poupanca);

        banco.setContas(contas);

        // System.out.println(String.valueOf(banco.getContas()));

        
        poupanca.cadastrarChavePix("email", "paulo.sales@outlook.com", contas);
        cc.cadastrarChavePix("email", "paulo.sales@outlook.com", contas);
        
        cc.impprimirDados();
        poupanca.impprimirDados();

        
        cc.depositar(1000);
        cc.sacar(300);
        cc.transferir(500, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cartao cartao = new Cartao(paulo);
        cartao.impprimirDados();

    }
}