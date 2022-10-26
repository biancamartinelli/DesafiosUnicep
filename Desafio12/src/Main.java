import java.util.Scanner;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
        CalculoStrategy cal;


        Scanner in =  new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println(" Calculadora ");
        System.out.println("----------------------------");
        System.out.println("Selecione a operação");
        System.out.println("+: Soma");
        System.out.println("-: Subtração");
        System.out.println("*: Multiplicação");
        System.out.println("/: Divisão");


        String operacao = in.next();
        switch(operacao){
            case "+":
                cal = new Soma();
                break;
            case "-":
                cal = new Subtracao();
                break;
            case "*":
                cal = new Multiplicacao();
                break;
            case "/":
                cal = new Divisao();
                break;
            default:
                cal = new Soma();
                break;
        }

        System.out.println("Informe o 1º número: ");
        Float a = Float.parseFloat(in.next());
        System.out.println("Informe o 2º número: ");
        Float b = in.nextFloat();
        System.out.println("O resultado da operação é: " + cal.calcular(a, b));
        in.close();

    }
}