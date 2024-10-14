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
public class Raices1 {
    public static double Curva(double x){
        double y = -5*Math.sin(x)-Math.exp(x);
        return y;
    }
    public static void main(String[] args) {
        int nmi = Integer.parseInt(JOptionPane.showInputDialog("Dame NMI:"));//Número máximo de iteraciones.
        
        double[] xm= new double[nmi];
        double[] ym= new double[nmi];
        double[] rel= new double[nmi];
        
        
        double error = Double.parseDouble(JOptionPane.showInputDialog("Dame el error:"));
        
        int it=-1;
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Dame el x1:"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Dame el x2:"));
        
        double y1 = Curva(x1);
        double y2 = Curva(x2);
        
        if(y1>=0 && y2<0){
            double buffer =x1;
            x1=x2;
            x2=buffer;
        }
        
        do {          
            it++;
            xm[it] = (x1+x2)/2;
            ym[it] = Curva(xm[it]);
            rel[it] = x2-x1;
            
            if(Math.abs(rel[it]) < error){
                JOptionPane.showMessageDialog(null, "La raíz es: "+ xm[it]);
                break;
            } else if(ym[it] < 0)
                x1 = xm[it];
            else
                x2 = xm[it];
            
        } while (Math.abs(rel[it]) > error && it<= nmi);
        
        if (Math.abs(rel[it])>error)
            JOptionPane.showMessageDialog(null,"Agoto iteraciones");
        
        String bufferString="";
        for(int i=0; i<=it;i++)
            bufferString += "it #"+(i)+" xm="+xm[i]+" ym="+ym[i]+" rel="+rel[i]+"\n";
        JOptionPane.showMessageDialog(null, "Se hicieron :"+(it+1)+" iteraciones\n"+bufferString);
    }
}
