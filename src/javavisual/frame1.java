package javavisual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame1 extends JFrame{
    
    JLabel label1 = new JLabel("Ini label pertamaQYUh");
    JTextField jtf1 = new JTextField();
    
    public frame1(){
        setTitle("Ini loh TITLE");
        setSize(600,400);
        setLocation(100,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void tampil(){
        getContentPane().setLayout(null);
        getContentPane().add(label1);
        //left top width height
        label1.setBounds(10,10,150,20);
        setVisible(true);
    }
}
