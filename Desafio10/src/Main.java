import Controle.Calculadora;
import Modelo.CalculadoraModel;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        String ent;
        Calculadora cal = new Calculadora();

        ent = JOptionPane.showInputDialog("Selecione a operação: (+, -, *, / )"
                +"\n Se estiver vazio, será soma!");
        cal.setCalcular(ent);

        ent = JOptionPane.showInputDialog("Informe o primeiro número:  ");
        cal.getCalcular().setA(Integer.parseInt(ent));

        ent = JOptionPane.showInputDialog("Informe o segundo número:  ");
        cal.getCalcular().setB(Integer.parseInt(ent));

        JOptionPane.showMessageDialog(null,
                "O resultado é " + cal.getCalcular().calculo(),
                "Resultado",
                JOptionPane.QUESTION_MESSAGE);




    }
}