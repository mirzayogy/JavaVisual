package javavisual;

import javax.swing.JFrame;

public class frame1 extends JFrame{
    public frame1(){
        setTitle("Ini loh TITLE");
        setSize(600,400);
        setLocation(100,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void tampil(){
        setVisible(true);
    }
}
