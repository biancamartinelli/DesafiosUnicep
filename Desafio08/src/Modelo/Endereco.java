package Modelo;

public class Endereco {
    private String logadouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco() {
    }

    public Endereco(String logadouro, String numero, String bairro, String cidade, String uf) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\tLogadouro='" + logadouro + '\'' +
                "\n\tNúmero='" + numero + '\'' +
                "\n\tBairro='" + bairro + '\'' +
                "\n\tCidade='" + cidade + '\'' +
                "\n\tUF='" + uf + '\'' +
                "\n\t}";
    }
}
