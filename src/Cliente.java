public class Cliente {

    private String nome;
    private String endereco;
    private String email;

    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}