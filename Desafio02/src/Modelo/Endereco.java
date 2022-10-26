package Modelo;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private Integer num;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, String cidade, String estado, String cep, Integer num) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.num = num;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "\n Endereco{" +
                "\n rua='" + rua + '\'' +
                "\n bairro='" + bairro + '\'' +
                "\n cidade='" + cidade + '\'' +
                "\n estado='" + estado + '\'' +
                "\n cep='" + cep + '\'' +
                "\n num=" + num +
                "\n}";
    }
}
