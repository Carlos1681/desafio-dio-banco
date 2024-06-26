public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor){

        if (valor <= saldo){
            saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComum() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
        System.out.println(String.format("Cliente: %s", cliente.getNome()));
        System.out.println(String.format("Endereço: %s", cliente.getEndereco()));
        System.out.println(String.format("Email: %s", cliente.getEmail()));
        System.out.println(String.format("Banco: %s", banco.getNome()));
    }

}
