/*
Tarea 9 sept. Punto de venta que atienda a una serie de clientes, 
que pida concepto y precio del producto e imprima el ticket con iva(16%)
y total calculado.
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
