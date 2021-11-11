/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operator;

/**
 *
 * @author cad-server
 */
import javax.swing.JTextPane;
import java.awt.print.PrinterException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class no_antri {
private String nof ;

    public static void main(String[] args) {
            no_antri a = new no_antri();
            a.antri(a.nof);
    }
    
    
    public void antri(String no){
        JTextPane textPane = new JTextPane();
        textPane.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        textPane.setText(no);
        try {
            System.out.println(no);
            textPane.print();
        }catch(Exception e){
            
        }
    }
    
}