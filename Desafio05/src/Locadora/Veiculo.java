package Locadora;

public abstract class Veiculo {
    private String placa;
    private Integer procedencia;
    private String marca;
    private String modelo;
    private Integer anoDoModelo;
    private Integer anoDaFabricação;
    private String chassi;
    private String renavam;
    private Float combustivel;
    private String motor;
    private Double consumoMedio;
    private Double quilometragem;

    public Veiculo() {
    }

    public Veiculo(String placa, Integer procedencia, String marca, String modelo, Integer anoDoModelo, Integer anoDaFabricação, String chassi, String renavam, Float combustivel, String motor, Double consumoMedio, Double quilometragem) {
        this.placa = placa;
        this.procedencia = procedencia;
        this.marca = marca;
        this.modelo = modelo;
        this.anoDoModelo = anoDoModelo;
        this.anoDaFabricação = anoDaFabricação;
        this.chassi = chassi;
        this.renavam = renavam;
        this.combustivel = combustivel;
        this.motor = motor;
        this.consumoMedio = consumoMedio;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Integer procedencia) {
        this.procedencia = procedencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoDoModelo() {
        return anoDoModelo;
    }

    public void setAnoDoModelo(Integer anoDoModelo) {
        this.anoDoModelo = anoDoModelo;
    }

    public Integer getAnoDaFabricação() {
        return anoDaFabricação;
    }

    public void setAnoDaFabricação(Integer anoDaFabricação) {
        this.anoDaFabricação = anoDaFabricação;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Float combustivel) {
        this.combustivel = combustivel;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }
}