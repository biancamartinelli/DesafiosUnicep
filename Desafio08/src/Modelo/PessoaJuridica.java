package Modelo;

public class PessoaJuridica extends Pessoa{

    private String nomeFantasma;
    private String inscEstadual;
    private String inscMunicipal;
    private String website;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String telefone, String email, String disciplina, Endereco endereco, String documento, String nomeFantasma, String inscEstadual, String inscMunicipal, String website) {
        super(nome, telefone, email, disciplina, endereco, documento);
        this.nomeFantasma = nomeFantasma;
        this.inscEstadual = inscEstadual;
        this.inscMunicipal = inscMunicipal;
        this.website = website;
    }

    public String getNomeFantasma() {
        return nomeFantasma;
    }

    public void setNomeFantasma(String nomeFantasma) {
        this.nomeFantasma = nomeFantasma;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getInscMunicipal() {
        return inscMunicipal;
    }

    public void setInscMunicipal(String inscMunicipal) {
        this.inscMunicipal = inscMunicipal;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "\nRazão Social='" + nome + '\'' +
                "\nNome Fantasma='" + nomeFantasma + '\'' +
                "\nCNPJ= '" + documento + '\'' +
                "\nInsc. Estadual='" + inscEstadual + '\'' +
                "\nInscMunicipal='" + inscMunicipal + '\'' +
                "\nWebsite='" + website + '\'' +
                "\n" + super.toString() +
                "\n}";

    }
}
