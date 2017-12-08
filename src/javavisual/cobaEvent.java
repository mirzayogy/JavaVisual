/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavisual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author mirza
 */
public class cobaEvent extends JFrame {
    JTextField jtf1 = new JTextField();
    JTextField jtf2 = new JTextField();
    JTextField jtfHasil = new JTextField();
    JButton btnHitung = new JButton("+");
    JButton btnExit = new JButton("Exit");
    
    cobaEvent(){
        setLocationRelativeTo(null);
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void komponenVisual(){
        getContentPane().setLayout(null);
        getContentPane().add(jtf1);
        getContentPane().add(jtf2);
        getContentPane().add(jtfHasil);
        getContentPane().add(btnHitung);
        getContentPane().add(btnExit);
        
        jtf1.setBounds(10,10,50,20);
        jtf2.setBounds(70,10,50,20);
        btnHitung.setBounds(130,10,50,20);
        jtfHasil.setBounds(190,10,50,20);
        btnExit.setBounds(150,50,90,20);       
    }
    
    void aksiReaksi(){
        btnExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        btnHitung.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "ISI PESAN",
                        "Ini Pesan Loh",
                        JOptionPane.ERROR_MESSAGE);
                double x1,x2,hasil;
                x1 = Float.parseFloat(jtf1.getText());
                x2 = Float.parseFloat(jtf2.getText());
                hasil = x1+x2;
                jtfHasil.setText(String.valueOf(hasil));
                
                throw new UnsupportedOperationException
                ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        jtf1.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==e.VK_ENTER){
                    jtf2.requestFocus();
                }
            }
        });
        
        jtf2.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==e.VK_ENTER){
                     double x1,x2,hasil;
                x1 = Float.parseFloat(jtf1.getText());
                x2 = Float.parseFloat(jtf2.getText());
                hasil = x1+x2;
                jtfHasil.setText(String.valueOf(hasil));
                
                }
            }
        });
        
    }
    
    public static void main(String[] args) {
        cobaEvent c = new cobaEvent();
        c.komponenVisual();
        c.aksiReaksi();
        c.setVisible(true);
    }
    
}
