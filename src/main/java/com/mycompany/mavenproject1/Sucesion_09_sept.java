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
