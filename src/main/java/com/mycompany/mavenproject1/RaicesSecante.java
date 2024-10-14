
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class RaicesSecante {
    public static double Curva(double x){
        double y = -5*Math.sin(x)-Math.exp(x);
        return y;
    }

    public static void main(String[] args) {
        int nmi = Integer.parseInt(JOptionPane.showInputDialog("Dame nmi:"));
        
        double[] xm= new double[nmi];
        double[] ym= new double[nmi];
        double[] rel= new double[nmi];
        int it=0;
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Dame x1:"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Dame x2:"));
        double error = Double.parseDouble(JOptionPane.showInputDialog("Dame el Error:"));
   
        do {          
            it++;
            xm[it] = x2 - (Curva(x2)*(x2-x1)/(Curva(x2)-Curva(x1)));
            ym[it] = Curva(xm[it]);
            if(ym[it]* Curva(x2)<0){
            rel[it] = xm[it]-x1;
            x1=xm[it];
            } else if(ym[it]* Curva(x1)<0){
            rel[it] = xm[it]-x2;
            x2=xm[it];
            }
            if(Math.abs(rel[it]) < error){
                JOptionPane.showMessageDialog(null, "La raíz es: "+ xm[it]);
                break;
            }
            
        } while ((Math.abs(rel[it]) > error && it<= nmi));
        
        if (Math.abs(rel[it])>error)
            JOptionPane.showMessageDialog(null,"Agoto iteraciones");
        
        String bufferString="";
        for(int i=0; i<=it;i++)
            bufferString += "it #"+(i)+" xm="+xm[i]+" ym="+ym[i]+" rel="+rel[i]+"\n";
        JOptionPane.showMessageDialog(null, "Se hicieron :"+(it+1)+" iteraciones\n"+bufferString);
    }
}
