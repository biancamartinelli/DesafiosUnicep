import Locadora.*;
import Auxiliar.ProcedenciaEnum;

public class Main {

    public static void main(String[] args) {
        Veiculo v1 = new VeiculoCarga("1A2B3C4", Procedencia.NACIONAL, "Ford",
                "Ka", 2004, 2005, "12345678-ass", "8475619-421", 40.0F, "motor v4",
                9.4, 1325.4, 1000.0, 2, 3, 6);
);
        Veiculo v2 = new VeiculoPassageiro("2E3G9IO", Procedencia.IMPORTADO, "Chevrolet",
                "Monza", 2005, 2006, "41597746-98","12545585-98", 45.0F, "Motor V5",
                11.6, 13584.8, "Prata", "Neutra", 4, 4, "Tela pra assistir filmes");




    }
}