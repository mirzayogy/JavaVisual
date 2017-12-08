package javavisual;

import java.awt.Color;
import javax.swing.*;

public class frame1 extends JFrame{
    
    JLabel label1 = new JLabel("Ini label pertamaQYUh");
    JTextField jtf1 = new JTextField();
    JButton btn1 = new JButton("TOMBOL");
    JRadioButton jrb1 = new JRadioButton("Laki-laki");
    JRadioButton jrb2 = new JRadioButton("Perempuan");
    ButtonGroup bg1 = new ButtonGroup();    
    String [] kota = {"BJB","MTP","BJM"};
    JComboBox jcb1 = new JComboBox(kota);
    JTextArea textArea = new JTextArea();
    
    
    
    public frame1(){
        setTitle("Ini loh TITLE");
        setSize(600,400);
        setLocation(100,200);
        setBackground(Color.yellow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void tampil(){
        getContentPane().setLayout(null);
        getContentPane().add(label1);
        getContentPane().add(jtf1);
        getContentPane().add(btn1);
        getContentPane().add(jrb1);
        getContentPane().add(jrb2);
        getContentPane().add(jcb1);
        getContentPane().add(textArea);
        
        //left top width height
        label1.setBounds(10,10,150,20);
        jtf1.setBounds(180,10,150,20);
        textArea.setBounds(340,10,200,100);
        jrb1.setBounds(10,40,130,20);
        jrb2.setBounds(160,40,130,20);
        jcb1.setBounds(10,70,130,20);
        btn1.setBounds(10,100,100,20);
        bg1.add(jrb1);
        bg1.add(jrb2);
        setVisible(true);
    }
}
