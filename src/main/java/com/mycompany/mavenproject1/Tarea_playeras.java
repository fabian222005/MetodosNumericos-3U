/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author fabian
 */

public class Tarea_playeras extends JFrame implements ItemListener {

    private JComboBox<String> combo1;
    private JTextField preciosel;
    private JButton okButton;
    private double precio;
    private int Descuento;
    public Tarea_playeras(){
        setLayout(null);
        setTitle("Calculador de playeras");
        JComboBox<String> combo1=new JComboBox<String>();
        combo1.setBounds(10,10,160,20);
        add(combo1);
        combo1.addItem("----");
        combo1.addItem("Blanco");
        combo1.addItem("Negro");
        combo1.addItem("Gris");
        combo1.addItem("Amarillo");
        combo1.addItem("Rojo");
        combo1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            hacer((String)combo1.getSelectedItem());
        }
        });
    }
    public void itemStateChanged(ItemEvent e){}
    public void hacer(String seleccion){
        if(seleccion=="----"){
            JOptionPane.showMessageDialog(rootPane, "Error no seleccionado");
        }
        else {
        JTextField preciosel = new JTextField();
        JLabel label = new JLabel("Precio");
        label.setBounds(10,40,160,18);
        add(label);
        preciosel.setBounds(10,40+20,160,20);
        add(preciosel);
        JButton okButton = new JButton("Ok");
        okButton.setBounds(10,40+20+30, 60,20);
        add(okButton);
        invalidate();
        validate();
        repaint();
        Descuento =0;
        if (seleccion == "Blanco") Descuento=1;
        okButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                precio = Double.parseDouble(preciosel.getText());
                precio = precio*(1-0.40*Descuento);
                JOptionPane.showMessageDialog(preciosel,"El precio es: $"+ precio + (Descuento == 1 ? " y tiene descuento del 40%":"."));
                dispose();
            }
        });
        }
    }
    
    public static void main(String[] args) {
        Tarea_playeras formu=new Tarea_playeras();
        formu.setBounds(400,400,200,150);
        formu.setVisible(true);
        formu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //System.out.printf("Area=%f\n",area);
        /*int intt = Integer.parseInt(JOptionPane.showInputDialog("Ingaturroña"));
        String stri = JOptionPane.showInputDialog("Ingaturroña");
        System.out.printf("%d", intt);
        System.out.printf(stri);*/
    }
}