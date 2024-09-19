/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author fabian
 
 */
public class Mavenproject1 extends JFrame implements ItemListener {

    private JComboBox<String> combo1;
    public Mavenproject1(){
        setLayout(null);
        JComboBox<String> combo1=new JComboBox<String>();
        combo1.setBounds(10,10,240,30);
        add(combo1);
        combo1.addItem("----");
        combo1.addItem("Triangulo");
        combo1.addItem("Op_fundamentales");
        combo1.addItem("Centro_de_gravedad");
        combo1.addItem("T04-Sept-Playeras");
        combo1.addItem("Becas");
        combo1.addItem("Sucesión");
        combo1.addItem("Ganancia Rifa");
        combo1.addItem("Factorial");
        combo1.addItem("T09-Sept-PuntodeV");
        combo1.addItem("T09-Sept-pdv");
        combo1.addItem("Arreglos");
        combo1.addItem("Raices");
        combo1.addItem("Seno");
        combo1.addItem("SenoClase");
        combo1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            hacer((String)combo1.getSelectedItem());
        }
        });
    }
    public void itemStateChanged(ItemEvent e){}
    public void hacer(String seleccion){
            setTitle("Seleccionado");
            System.out.print(seleccion);
            switch (seleccion){
                case "Triangulo":
                    Triangulo.main(null);
                    break;
                case "Op_fundamentales":
                    Operaciones_fundamentales.main(null);
                    break;
                case "Centro_de_gravedad":
                    Centro_de_gravedad.main(null);
                    break;
                case "T04-Sept-Playeras":
                    Tarea_playeras.main(null);
                    break;
                case "Becas":
                    Clase_becas5sep.main(null);
                    break;
                case "Sucesión":
                    Sucesion_09_sept.main(null);
                    break;
                case "Ganancia Rifa":
                    Boletos_9sept.main(null);
                    break;
                case "Factorial":
                    Factorial_9sept.main(null);
                    break;
                case "T09-Sept-PuntodeV":
                    Tarea_9Sept_PuntodeVenta.main(null);
                    break;
                case "T09-Sept-pdv":
                    Tarea_9sept_pdv.main(null);
                    break;
                case "Arreglos":
                    Arreglo.main(null);
                    break;
                case "Raices":
                    Arreglos2.main(null);
                    break;
                case "Seno":
                    Serie_del_seno.main(null);
                    break;
                case "SenoClase":
                    SenoClase.main(null);
                    break;
                /*case "Triangulo":
                    Triangulo.main();
                    break;*/
            }     
    }
    
    public static void main(String[] args) {
        Mavenproject1 formu=new Mavenproject1();
        formu.setBounds(400,400,260,150);
        formu.setVisible(true);
        formu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //System.out.printf("Area=%f\n",area);
        /*int intt = Integer.parseInt(JOptionPane.showInputDialog("Ingaturroña"));
        String stri = JOptionPane.showInputDialog("Ingaturroña");
        System.out.printf("%d", intt);
        System.out.printf(stri);*/
    }
}
