/*
Programa para calcular cuantas raices contiene una ecuación alg. de la forma f(x)=0, en determinado rango, y que imprima cada uno de los intervalos.
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class Arreglos2 {
    public static double Curva(double x){
        double y = -5*Math.sin(x)-Math.exp(x);
        return y;
    }
    public static void main(String[] args) {
        double[] x1= new double[20];
        double[] x2= new double[20];
        
        int ln = Integer.parseInt(JOptionPane.showInputDialog("Dame Ln:"));
        int lp= Integer.parseInt(JOptionPane.showInputDialog("Dame Lp:"));
        
        double dx = Double.parseDouble(JOptionPane.showInputDialog("Dame Δx:"));
        
        int r=-1;
        double xx1 = ln;
        double xx2 = 0;
        
        do {            
            xx2 = xx1 + dx;
            double y1 = Curva(xx1);
            double y2 = Curva(xx2);
            
            if (y1*y2 <0){
                r++;
                x1[r]=xx1;
                x2[r]=xx2;
            }
            xx1=xx2;
        } while (xx2 < lp);
        
        String bufferString="";
        for(int i=0; i<=r;i++)
            bufferString += "Raíz #"+(i+1)+"("+x1[i]+","+x2[i]+")\n";
        JOptionPane.showMessageDialog(null, "Se encontraron :"+(r+1)+" raíces\n"+bufferString);
    }
}
