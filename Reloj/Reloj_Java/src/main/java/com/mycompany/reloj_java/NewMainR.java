/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reloj_java;

public class NewMainR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClassReloj hilo1= new NewClassReloj();
        Thread h1= new Thread(hilo1);
        h1.start();
    }
    
}
