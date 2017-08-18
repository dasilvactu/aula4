/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaBotoes janela = new JanelaBotoes();
        janela.setSize(500,700);
//        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
