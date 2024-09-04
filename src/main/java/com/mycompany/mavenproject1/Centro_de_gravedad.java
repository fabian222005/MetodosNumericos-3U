/*
 * Programa para calcular el centro de gravedad de tres fuerzas que actuan sobre una ala,
determine Fuerza Resultante y Dirección
*/
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;
//import java.lang.Math;
/**
 *
 * @author fabian
 */
public class Centro_de_gravedad {
    public static void main(String[] args) {
            double mag_f1 = Double.parseDouble(JOptionPane.showInputDialog("Dame la magnitud de la Fuerza 1:"));
            double ang_f1 = Double.parseDouble(JOptionPane.showInputDialog("Dame el ángulo de la Fuerza 1:"));
            double mag_f2 = Double.parseDouble(JOptionPane.showInputDialog("Dame la magnitud de la Fuerza 2:"));
            double ang_f2 = Double.parseDouble(JOptionPane.showInputDialog("Dame el ángulo de la Fuerza 2:"));
            double mag_f3 = Double.parseDouble(JOptionPane.showInputDialog("Dame la magnitud de la Fuerza 3:"));
            double ang_f3 = Double.parseDouble(JOptionPane.showInputDialog("Dame el ángulo de la Fuerza 3:"));
            
            double x_f1 = mag_f1*Math.cos(Math.toRadians(ang_f1));
            double y_f1 = mag_f1*Math.sin(Math.toRadians(ang_f1));
            double x_f2 = mag_f2*Math.cos(Math.toRadians(ang_f2));
            double y_f2 = mag_f2*Math.sin(Math.toRadians(ang_f2));
            double x_f3 = mag_f3*Math.cos(Math.toRadians(ang_f3));
            double y_f3 = mag_f3*Math.sin(Math.toRadians(ang_f3));
            
            double x_fr = x_f1+x_f2+x_f3;
            double y_fr = y_f1+y_f2+y_f3;
            
            double mag_fr = Math.sqrt((y_fr*y_fr)+(x_fr*x_fr));
            double ang_fr = Math.toDegrees(Math.atan((y_fr/x_fr)));
            
            JOptionPane.showMessageDialog(null,"La magnitud es: "+mag_fr+"N y su ángulo es de: "+ang_fr+"°.");
    }
}
