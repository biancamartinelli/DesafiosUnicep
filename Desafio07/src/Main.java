import Modelo.*;

public class Main {
    public static void main(String[] args) {

        Figura tri = new TrianguloRetangulo(9,3);
        Figura qua = new Retangulo(8,9);

        System.out.println("A área do "+ tri.getTipo() + " é: " + tri.calculaArea());
        System.out.println("A área do " + qua.getTipo() + " é: " + qua.calculaArea());

    }
}