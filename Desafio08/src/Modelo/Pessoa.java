package Modelo;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected String disciplina;
    protected Endereco endereco;
    protected String documento;


    public Pessoa() {

    }

    public Pessoa(String nome, String telefone, String email, String disciplina, Endereco endereco, String documento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.disciplina = disciplina;
        this.endereco = endereco;
        this.documento = documento;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return
                "Telefone='" + telefone + '\'' +
                "\nE-mail='" + email + '\'' +
                "\nDisciplina='" + disciplina + '\'' +
                "\nEndereço=" + endereco;
    }
}
