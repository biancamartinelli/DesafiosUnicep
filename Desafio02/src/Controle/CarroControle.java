package Controle;

import Modelo.Carro;

import java.util.ArrayList;

public class CarroControle {

    public CarroControle() {
    }

    private ArrayList<Carro> carros = new ArrayList<>();

    public void save( Carro carro){
        carros.add(carro);
    }
        public Carro findByPlaca(String placa){
        Carro ret = null;

          for(Carro carro: carros){
              if(carro.getPlaca().equals(placa)){
                ret = carro;
              }
          }
          return ret;
        }


}
