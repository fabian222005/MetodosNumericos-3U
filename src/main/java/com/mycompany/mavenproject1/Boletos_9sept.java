/*
 CLase 9 sept.
El grupo 3u realiza una rifa de una bici, para pagar su graduación, el boleto
cuesta lo mismo que su número de serie, con los datos de boletos girados y
costo de la bici calcular la ganancia
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
        JOptionPane.showMessageDialog(null,"Para los "+boletos+" se recibió: $"+ suma + " y la bicicleta costó: $" + costo + ", la ganancia fue de: $"+ganancia+".");
    }
}
