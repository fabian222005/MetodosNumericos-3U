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
public class Boletos_9sept {
    public static void main(String[] args) {
        int boletos = Integer.parseInt(JOptionPane.showInputDialog("Número de boletos:"));
        double costo = Double.parseDouble(JOptionPane.showInputDialog("Costo de la bicicleta:"));
        
        double suma = 0;
        for(int i=0; i<= boletos; i++)
            suma = suma +i;
        
        double ganancia = suma - costo;
        JOptionPane.showMessageDialog(null,"Para los "+boletos+" y la bicicleta costó: $" + suma + ", la ganancia fue de: $"+ganancia+".");
    }
}
