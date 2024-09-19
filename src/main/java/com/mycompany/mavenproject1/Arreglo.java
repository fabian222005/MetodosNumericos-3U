/*
 Clase 12 sept. Cree un arreglo del 0 al n e imprima la sucesión.
*/
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class Arreglo {
    public static void main(String[] args) {
        int[] lista = new int[20];
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Dame n:"));
        for(int i =0; i<n;i++)
            lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Dame el elemento "+i+":"));
        String buff ="";
        for(int i =0; i<n;i++)
            buff += lista[i]+"\n";
        JOptionPane.showMessageDialog(null, buff);
    }
   
}
