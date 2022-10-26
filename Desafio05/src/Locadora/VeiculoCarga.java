package Locadora;

public class VeiculoCarga extends Veiculo{
    private Double capacidadeMax;
    private Integer altura;
    private Integer largura;
    private Integer profundidade;

    public VeiculoCarga() {
    }



    public VeiculoCarga(String placa, Integer procedencia, String marca, String modelo, Integer anoDoModelo, Integer anoDaFabricação, String chassi, String renavam, Float combustivel, String motor, Double consumoMedio, Double quilometragem, Double capacidadeMax, Integer altura, Integer largura, Integer profundidade) {
        super(placa, procedencia, marca, modelo, anoDoModelo, anoDaFabricação, chassi, renavam, combustivel, motor, consumoMedio, quilometragem);
        this.capacidadeMax = capacidadeMax;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public Double getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(Double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
    }
}
