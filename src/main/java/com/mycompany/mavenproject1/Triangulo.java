/*
 * Calcule el área de un triangulo
*/
package com.mycompany.mavenproject1;
import javax.swing.*;
public class Triangulo {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Dame la base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Dame la altura"));
        double area = base*altura/2;
        JOptionPane.showMessageDialog(null, "Área="+area);
        //System.out.printf("Area=%f/n",area);
    }
    
}
