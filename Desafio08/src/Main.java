import Modelo.*;
public class Main {

    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua Secundária","1536","Santa Fé","São Carlos","SP");
        Endereco end2 = new Endereco("Av. Principal","393","Centro","São Carlos","SP");

        Pessoa p1 = new PessoaFisica("Meu nome",  "1699993336",   "Matemática",  "email@email.com",  end1, "42158544-74",  "364984981", "Phd");
        Pessoa p2 = new PessoaJuridica("Seu nome", "16955585474",  "email2@email.com,br","Portugues", end2,"12345678912365", "Karthus", "Estadual", "Municipal", "ultglobla.org");

        System.out.println(p1);
        System.out.println(p2);


    }
}