/*
 * Tarea Calcule las operaciones fundamentales entre dos números
*/
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author fabian
 */
public class Operaciones_fundamentales {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Número A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Número B:"));
        
        JOptionPane.showMessageDialog(null,"Suma:\na+b="+(a+b));
        JOptionPane.showMessageDialog(null,"Resta:\na-b="+(a-b));
        JOptionPane.showMessageDialog(null,"Multiplicación:\na*b="+(a*b));
        JOptionPane.showMessageDialog(null,"División:\na/b="+(a/b));
    }
}
