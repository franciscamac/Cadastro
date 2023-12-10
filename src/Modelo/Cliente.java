
package Modelo;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private int telefone;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Cliente( String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente() {
    }
    
    @Override
    public String toString() {
        return "Banco{ nome=" + nome + ", email=" + email + ", telefone=" + telefone + '}';
    }
}
