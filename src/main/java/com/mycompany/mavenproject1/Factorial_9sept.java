/*
 Clase 9 sept. Calcule e imprima el factorial para un numero n.
 */
package com.mycompany.mavenproject1;
import javax.swing.*;
/**
 *
 * @author fabian
 */
public class Factorial_9sept {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Dame n:"));
        
        long fact=1;
        for(int i = 1; i<=n; i++)
            fact *=i;
        
        JOptionPane.showMessageDialog(null,"El factiorial de: "+n+" es: " + fact);
    }
}
