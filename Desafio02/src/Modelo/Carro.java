package Modelo;

public class Carro {
    private String placa;
    private String modelo;
    private String fabricante;
    private String cor;
    private Integer ano;

    private Cliente cliente;

    public Carro() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro(String placa, String modelo, String fabricante, String cor, Integer ano, Cliente cliente) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.cliente = cliente;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\n Carro{" +
                "\n placa='" + placa + '\'' +
                "\n modelo='" + modelo + '\'' +
                "\n fabricante='" + fabricante + '\'' +
                "\n cor='" + cor + '\'' +
                "\n ano=" + ano +
                "\n}";
    }
}
