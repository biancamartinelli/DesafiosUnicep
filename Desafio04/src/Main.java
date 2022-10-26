import app.Calculo;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Calculo cal= new Calculo();

        System.out.println("----------------------------------");
        System.out.println("Calculo do volume para o concreto");
        System.out.println("-----------------------------------");


        System.out.println("Informe a base da viga: (em número natural)");
        cal.setBase(in.nextInt());
        System.out.println("Informe a largura da viga: (em número natural)");
        cal.setLargura(in.nextInt());
        System.out.println("Informe o comprimento da vida: (em número natural)");
        cal.setComprimento(in.nextInt());

        System.out.println("\n\n O volume necessário para contruir a viga é de :" + cal.calculaVolume() + " litros");
        in.close();



    }
}