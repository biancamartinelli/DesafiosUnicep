package Locadora;

public class VeiculoPassageiro extends Veiculo{
   private String corExterna;
   private String corInterna;
   private Integer numPorta;
   private Integer numPassageiros;
   private String opcionais;

   public VeiculoPassageiro() {

   }



   public VeiculoPassageiro(String placa, Integer procedencia, String marca, String modelo, Integer anoDoModelo, Integer anoDaFabricação, String chassi, String renavam, Float combustivel, String motor, Double consumoMedio, Double quilometragem, String corExterna, String corInterna, Integer numPorta, Integer numPassageiros, String opcionais) {
      super(placa, procedencia, marca, modelo, anoDoModelo, anoDaFabricação, chassi, renavam, combustivel, motor, consumoMedio, quilometragem);
      this.corExterna = corExterna;
      this.corInterna = corInterna;
      this.numPorta = numPorta;
      this.numPassageiros = numPassageiros;
      this.opcionais = opcionais;
   }

   public String getCorExterna() {
      return corExterna;
   }

   public void setCorExterna(String corExterna) {
      this.corExterna = corExterna;
   }

   public String getCorInterna() {
      return corInterna;
   }

   public void setCorInterna(String corInterna) {
      this.corInterna = corInterna;
   }

   public Integer getNumPorta() {
      return numPorta;
   }

   public void setNumPorta(Integer numPorta) {
      this.numPorta = numPorta;
   }

   public Integer getNumPassageiros() {
      return numPassageiros;
   }

   public void setNumPassageiros(Integer numPassageiros) {
      this.numPassageiros = numPassageiros;
   }

   public String getOpcionais() {
      return opcionais;
   }

   public void setOpcionais(String opcionais) {
      this.opcionais = opcionais;
   }
}
