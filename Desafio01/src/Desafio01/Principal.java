package Desafio01;

public class Principal {
        public static void main(String[] args) {
            Endereco e1 = new Endereco("Alberto Lanzoni","Santa Felicia","SP","São Carlos","13562-390");
            Aluno a1 = new Aluno("Bianca","16000000","emailqualquer@gmail.com","1245635",e1);

        System.out.println("Dados Registrados!");
    }
}