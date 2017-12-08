/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavisual;

/**
 *
 * @author mirza
 */
public class cobaArray {
    public static void main(String[] args) {
        String [] kota = {"Barabai","Tanjung","Kandangan"};
        
        for(int i=0;i<=2;i++){
            System.out.println(kota[i]);
        }
        
        System.out.println("====================");
        
        System.out.println(kota[0]);
        System.out.println(kota[1]);
        System.out.println(kota[2]);
        
        String [][] piket ={
            {"Adul","Bejo","Candra"},
            {"Dodi","Emma","Fatur"},
            {"Gogon","Huda","Ima"}
        };
        
    
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println(piket[i][j]);
            }
        }
        
    }
}
