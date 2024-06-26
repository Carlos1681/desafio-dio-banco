public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(Cliente cliente, Banco banco, double taxaDeJuros) {
        super(cliente, banco);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void renderJuros() {
        double rendimento = getSaldo() * taxaDeJuros;
        depositar(rendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Poupanca ---");
        super.imprimirInfoComum();
    }
}
