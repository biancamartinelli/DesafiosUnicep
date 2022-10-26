package Associacao;

public class Fornecedor extends Pessoa{
    private String nomeFantasia;
    private String website;

    public Fornecedor() {
    }

    public Fornecedor(Integer id, String nome, String logadouro, Integer numero, String cep, String bairro, String UF, Integer telefone, String documento, String nomeFantasia, String website) {
        super(id, nome, logadouro, numero, cep, bairro, UF, telefone, documento);
        this.nomeFantasia = nomeFantasia;
        this.website = website;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
