package Associacao;

public class Associado extends Pessoa{
    private String situacao;
    private Integer numAssociado;

    public Associado() {
    }

    public Associado(Integer id, String nome, String logadouro, Integer numero, String cep, String bairro, String UF, Integer telefone, String documento, String situacao, Integer numAssociado) {
        super(id, nome, logadouro, numero, cep, bairro, UF, telefone, documento);
        this.situacao = situacao;
        this.numAssociado = numAssociado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getNumAssociado() {
        return numAssociado;
    }

    public void setNumAssociado(Integer numAssociado) {
        this.numAssociado = numAssociado;
    }
}
