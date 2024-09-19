/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
