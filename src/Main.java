import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Banco banco1 = new Banco("Santander");
        Banco banco2 = new Banco("Caixa");
        Cliente cliente1 = new Cliente(
                "José Silva",
                "Fortaleza, CE",
                "jose@hotmail.com");
        Cliente cliente2 = new Cliente(
                "Lucia Soares",
                "Rio de Janeiro, RJ",
                "lucia@gmail.com");
        List<Conta> conta = new ArrayList<>();

        conta.add(new ContaCorrente(cliente1, banco1));
        conta.add(new ContaPoupanca(cliente2, banco2, 0.05));

        ContaCorrente corrente = (ContaCorrente) conta.get(0);
        corrente.depositar(80);
        ContaPoupanca poupanca = (ContaPoupanca) conta.get(1);
        corrente.transferir(30, poupanca);
        poupanca.sacar(10);
        poupanca.depositar(40);
        poupanca.renderJuros();

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}