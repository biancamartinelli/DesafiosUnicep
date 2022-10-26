import Modelo.Aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String ent;
        Aluno a1 = new Aluno();

        ent = JOptionPane.showInputDialog(" Digite o Nome do aluno: ");
        a1.setNome(ent);

        ent = JOptionPane.showInputDialog(" Digite o Ra do aluno: ");
        a1.setNum(Integer.parseInt(ent));

        ent = JOptionPane.showInputDialog(" Digite o CPF do aluno: ");
        a1.setCpf(ent);

        ent = JOptionPane.showInputDialog(" Digite a nota 1 do aluno: ");
        a1.setNota1(Float.parseFloat(ent));

        ent = JOptionPane.showInputDialog(" Digite a nota 2 do aluno: ");
        a1.setNota2(Float.parseFloat(ent));

        JOptionPane.showMessageDialog(null,
                a1.calculaConceito(),
                "Resultado do conceito ",
                JOptionPane.INFORMATION_MESSAGE );



    }
}