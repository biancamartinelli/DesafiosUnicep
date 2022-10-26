package Associacao;

public class Pessoa {
    private Integer id;
    private String nome;
    private String logadouro;
    private Integer numero;
    private String cep;
    private String bairro;
    private String UF;
    private Integer telefone;
    private String documento;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String logadouro, Integer numero, String cep, String bairro, String UF, Integer telefone, String documento) {
        this.id = id;
        this.nome = nome;
        this.logadouro = logadouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.UF = UF;
        this.telefone = telefone;
        this.documento = documento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
