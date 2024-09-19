/*
Tarea realizada en clase 18 sept.:
Calcule e imprima la serie del seno con margen de error indicado por el 
usuario.
*/
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class SenoClase {
    public static double seno(double ang, double error) {
        double suma = ang, rel=0, app_rel=0, num = 0, den = 1, termino = 0;
        int cont =1, sign = 1;
        
        for(cont = 1; cont <=1000; cont+=2){
            sign *=-1;
            num = Math.pow(ang, cont);
            den *= cont;
            termino = num/den;
            suma += termino * sign;
            app_rel = suma -rel;
            rel = suma;
        } while (Math.abs(app_rel)>=error);
        return suma;
    }
        public static void main(String[] args) {
        double ang = Double.parseDouble(JOptionPane.showInputDialog(null, "Dame el ángulo")) % 360;
        double err = Double.parseDouble(JOptionPane.showInputDialog(null, "Dame el error"));
        double senov = 0;
        if (ang >= 180){
            ang = ang % 180;
            senov = -1* seno(ang*Math.PI/180,err);
        } else{
            senov = seno(ang*Math.PI/180, err);
        }
        JOptionPane.showMessageDialog(null,"El valor del seno es "+ senov);
    }
}
