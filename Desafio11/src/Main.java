import Controller.Product;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String ent;
        Product p1 = new Product();

        ent = JOptionPane.showInputDialog("Digite o preço do produto: ");
        p1.setPrecoDeCompra(Float.parseFloat(ent));
        p1.setModel();
        JOptionPane.showMessageDialog(
                null,
                "O valor do markup é: 1.54\n" +
                 "O valor dinal do produto é: R$ " +
                 p1.getModel().formula(p1.getPrecoDeCompra()),
                "Valor Final", JOptionPane.INFORMATION_MESSAGE);

    }
}