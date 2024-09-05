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
public class Clase_becas5sep {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad (en años):"));
        int sem = Integer.parseInt(JOptionPane.showInputDialog("Semestre (1-8):"));
        double prom = Double.parseDouble(JOptionPane.showInputDialog("Promedio (1-100):"));

        int beca=0;
        if(sem>=1 & sem <=5 & edad<=20 & prom>=80)
            beca=1000;
        else if(sem>=6 & sem <=7 & edad<=22 & prom>=80)
            beca=2000;
        else if(sem>=8 & edad<=23 & prom>=80)
            beca=3000;
        
        if (prom==100)
            beca = beca*2;
        
        JOptionPane.showMessageDialog(null, "Su beca es de: $"+beca);
    }
}
