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
public class Tarea_9sept_pdv {
    public static void main(String[] args) {
        boolean next =true;
        while (next) { 
        String recibo = "";  
        double total = 0;
            while (true) {             
                String compraString = JOptionPane.showInputDialog("Introduzca compra:");
                if("".equals(compraString))
                    break;
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca precio:"));
                recibo += "\n" + compraString + "    $"+precio;
                total  += precio;
            }
            recibo += "\n Subtotal       $"+total;
            recibo += "\n IVA            $"+total*0.16;
            recibo += "\n TOTAL          $"+total*1.16;
            JOptionPane.showMessageDialog(null, recibo);
            next = JOptionPane.showConfirmDialog(null, "¿Hay mas clientes?") == 0 ? true: false;
        }
    }
}
