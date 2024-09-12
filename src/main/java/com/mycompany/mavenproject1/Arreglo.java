/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
