package Desafio01;

public class Aluno {
    private String nome;
    private String telefone;
    private String email;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String telefone, String email, String matricula, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private Endereco endereco;


}
