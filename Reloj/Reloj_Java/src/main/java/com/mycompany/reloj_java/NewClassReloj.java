/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reloj_java;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewClassReloj extends Thread {
    
    public void run(){
        while(true){
            try {
                Calendar clr=Calendar.getInstance();
                int hr=clr.get(Calendar.HOUR);
                int min=clr.get(Calendar.MINUTE);
                int sg=clr.get(Calendar.SECOND);
                
                String tiempo= "Hora= "+ hr+ ": "+ min+ ": "+ sg;
                
                System.out.println(tiempo);
                //this.eti1.setText(tiempo);//
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewClassReloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}