/*
Tarea realizada en clase 18 sept.:
Calcule e imprima la serie del seno con margen de error indicado por el 
usuario.
*/
package com.mycompany.mavenproject1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class SenoClase {
    public static double seno(double ang, double error) {
        double suma = ang, rel=0, app_rel=0, num = 0, termino = 0;
        int sign = -1;
        BigDecimal den = BigDecimal.ONE;
        for(int cont = 3; cont <=1000; cont+=2){
            num = Math.pow(ang, cont);
            for (int i = cont-1; i <=cont; i++) 
                den = den.multiply(BigDecimal.valueOf(i));
            
            termino = BigDecimal.valueOf(num).divide(den, 20, RoundingMode.HALF_EVEN).doubleValue();
            suma += termino * sign;
            app_rel = suma -rel;
            rel = suma;
            sign *= -1;
            if (Math.abs(app_rel) < error)              
                break;
        }
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
