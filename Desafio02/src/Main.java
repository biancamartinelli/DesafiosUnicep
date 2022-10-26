import Controle.CarroControle;
import Controle.ClienteControle;
import Modelo.*;

import java.util.Arrays;

public class Main { public static void main(String[] args) {
    Endereco e1 =  new Endereco("Alberto L.","Sta Felicia","São Carlos","SP","1233456-636",121541);
    Cliente p1 = new Cliente("1325554455","Bianca","qualuqeremail@gmail.com",e1,132645641);
    Carro c1 = new Carro("13255","FordKa","Ford","Preto",2004,null);

    p1.getCarros().addAll(Arrays.asList(c1));
    CarroControle cc = new CarroControle();
    cc.save(c1);
    System.out.println(cc.findByPlaca("13255"));

    ClienteControle pc = new ClienteControle();
    pc.save(p1);
    System.out.println(pc.findByCpf("1325554455"));
    }
}
