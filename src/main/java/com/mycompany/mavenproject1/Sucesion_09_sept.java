/*
 * Clase 9  sept. Calcula la suma del 1 al n e imprimala
*/
package com.mycompany.mavenproject1;
import javax.swing.*;
/**
 *
 * @author fabian
 */
public class Sucesion_09_sept {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Dame N"));
        String suc = "La sucesión es:\n";
        for( int i =1; i<n; i++){
            suc += i+", ";
        }
        suc += n;
        
        JOptionPane.showMessageDialog(null, suc);
        
    }
}
