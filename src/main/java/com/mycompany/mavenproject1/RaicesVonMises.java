/*
Clase 26 sept:
Programa para calcular cuantas raices contiene una ecuación algebraica
de la forma f(x)=0, en determinado rango, y que imprima cada uno de los 
intervalos.
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class RaicesVonMises {
    public static double Curva(double x){
        double y = -5*Math.sin(x)-Math.exp(x);
        return y;
    }
    public static double Derivada(double x){
        double y = -5*Math.cos(x)-Math.exp(x);
        return y;
    }
    public static void main(String[] args) {        
        int nmi = Integer.parseInt(JOptionPane.showInputDialog("Dame NMI:"));//Número máximo de iteraciones.
        
        double[] xm= new double[nmi];
        double[] ym= new double[nmi];
        double[] rel= new double[nmi];
        
        double error = Double.parseDouble(JOptionPane.showInputDialog("Dame el error:"));
        
        int it=-1;
        double xn = Double.parseDouble(JOptionPane.showInputDialog("Dame el xn:"));
        double pendiente = Derivada(xn);
        do {          
            it++;
            xm[it] = xn - Curva(xn)/pendiente;
            ym[it] = Curva(xm[it]);
            rel[it] = xm[it]-xn;
            
            if(Math.abs(rel[it]) < error){
                JOptionPane.showMessageDialog(null, "La raíz es: "+ xm[it]);
                break;
            } else {
                 xn=xm[it]; 
            }
            
        } while (Math.abs(rel[it]) > error && it<= nmi && Math.round(Derivada(xn))!=0);
        
        if (Math.round(Derivada(xn))==0)
            JOptionPane.showMessageDialog(null,"m=0");
        if (Math.abs(rel[it])>error)
            JOptionPane.showMessageDialog(null,"Agoto iteraciones");
        
        String bufferString="";
        for(int i=0; i<=it;i++)
            bufferString += "it #"+(i)+" xm="+xm[i]+" ym="+ym[i]+" rel="+rel[i]+"\n";
        JOptionPane.showMessageDialog(null, "Se hicieron :"+(it+1)+" iteraciones\n"+bufferString);
    }
}
