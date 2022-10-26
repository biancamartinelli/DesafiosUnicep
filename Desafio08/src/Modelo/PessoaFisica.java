package Modelo;

public class PessoaFisica extends Pessoa{
    private String rg;
    private String titulacao;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String telefone, String email, String disciplina, Endereco endereco, String documento, String rg, String titulacao) {
        super(nome, telefone, email, disciplina, endereco, documento);
        this.rg = rg;
        this.titulacao = titulacao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "\nNome='" + nome + '\'' +
                "\nCPF= '" + documento + '\'' +
                "\nRG='" + rg + '\'' +
                "\nTitulação='" + titulacao + '\'' +
                "\n" + super.toString() +
                "\n}";
    }
}
