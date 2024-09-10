/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author fabian
 */
public class Tarea_9Sept_PuntodeVenta extends JFrame implements ItemListener {
    private static Object lock = new Object();
    private static JFrame frame = new JFrame();
    private Map<String, Double> articulosMap = new HashMap<String, Double>();
    public Tarea_9Sept_PuntodeVenta(){
        setLayout(null);
        setTitle("Punto de Venta");
        newprompt();
    }
    public void itemStateChanged(ItemEvent e){}
    public JTextField[] newtxt(List<JTextField[]> lista){
        JTextField work = new JTextField();
        JTextField workprec = new JTextField();
        Rectangle dim;
        Rectangle dimprec;
        dim = new Rectangle(20, 40, 160, 20);
        dimprec = new Rectangle(20, 40, 160, 20);
        int index = lista.size();
        System.err.println(index);
        work.setBackground(Color.yellow);
        work.setBounds(dim.x, dim.y+(dim.height*index), dim.width, dim.height);
        add(work);
        workprec.setBounds(dim.x+(165), dim.y+(dim.height*index), dim.width, dim.height);
        workprec.setBackground(Color.yellow);
        workprec.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            JTextField buf =  (JTextField)source;
            int indice = lista.size()-1;
//            System.out.println(lista.get(indice)[0].getText() + buf.getText());
            if (!"".equals(buf.getText()) && !"".equals(lista.get(indice)[0].getText())){
                lista.add(newtxt(lista));
                buf.setBackground(Color.white);
                lista.get(indice)[0].setBackground(Color.white);
                invalidate();
                validate();
                repaint();
                articulosMap.put(lista.get(indice)[0].getText(), Double.parseDouble(buf.getText()));
            }
        }
        });
        add(workprec);
        JTextField[] jTextFields = {work, workprec};
        return jTextFields;
    }
    
    public void calcularrecibo(){
        String reciboString = "Tienda Burros Blancos\n\n------------------------------\n";
        double subtotal = 0;
        for (Map.Entry<String,Double> artEntry : articulosMap.entrySet()){
            reciboString += artEntry.getKey() + " $"+artEntry.getValue()+"\n";
            subtotal += artEntry.getValue();
        }
        reciboString += "--------------------------------------------------\n";
        reciboString += "Subtotal         $" + subtotal;
        reciboString += "\nIVA (16%)        $" + subtotal*0.16;
        reciboString += "\n\nTotal            $" + subtotal*1.16;
        JOptionPane.showMessageDialog(rootPane, reciboString);
    }
    
    public void newprompt(){
        List<JTextField[]> conceptostxtb_map = new ArrayList<JTextField[]>();
        conceptostxtb_map.add(newtxt(conceptostxtb_map));
/*        List<JTextField> precios_txtb = new ArrayList<JTextField>();
        precios_txtb.add(newtxt(precios_txtb,0));
        
        List<JTextField> conceptos_txtb = new ArrayList<JTextField>();
        conceptos_txtb.add(newtxt(conceptos_txtb,1));*/
        
        JLabel labelconcepto = new JLabel("Concepto");
        labelconcepto.setBounds(20,20,160,30);
        add(labelconcepto);

        JLabel labelprecio = new JLabel("Precio");
        labelprecio.setBounds(20+160+40,20,160,30);
        add(labelprecio);
        
        JButton okButton = new JButton("Ok");
        okButton.setBounds(500,50, 60,20);
        okButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calcularrecibo();
            }
        });
        add(okButton);
        invalidate();
        validate();
        repaint();
        
        
    }
    
    public static void main(String[] args) {
        int no_de_clientes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de clientes a atender:"));
        for(int i = 0; i < no_de_clientes; i++){
            frame=new Tarea_9Sept_PuntodeVenta();
            frame.setBounds(0,0,1080,720);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        
        //System.out.printf("Area=%f\n",area);
        /*int intt = Integer.parseInt(JOptionPane.showInputDialog("Ingaturroña"));
        String stri = JOptionPane.showInputDialog("Ingaturroña");
        System.out.printf("%d", intt);
        System.out.printf(stri);*/
        }
    }
}