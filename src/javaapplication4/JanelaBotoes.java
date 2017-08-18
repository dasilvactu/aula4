/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class JanelaBotoes extends JFrame{
    private final JButton botaoSimples = new JButton("Clique");
    private final JButton botaoEnfeitado = new JButton("Clique de novo");
    public JanelaBotoes() throws HeadlessException {
        super("botoes");
        setLayout(new FlowLayout());
        add(botaoSimples);
        ImageIcon imagem =  new ImageIcon("resources/meme1.jpg");
        Image img1 = imagem.getImage();
        img1= img1.getScaledInstance(48, 48, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagem2 =  new ImageIcon("resources/meme2.jpg");
        Image img2 = imagem2.getImage();
        img2= img2.getScaledInstance(48, 48, java.awt.Image.SCALE_SMOOTH);
        botaoEnfeitado.setIcon(new ImageIcon(img1));
        botaoEnfeitado.setRolloverIcon(new ImageIcon(img2));
        add(botaoEnfeitado);
        BotaoClicado bc = new BotaoClicado();
        botaoSimples.addActionListener(bc);
        botaoEnfeitado.addActionListener(bc);
    }

    private  class BotaoClicado implements ActionListener {
           private int simples=0;
           private int enfeitado=0;
        public BotaoClicado() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== botaoSimples){
                simples++;
                JOptionPane.showMessageDialog(null, "Botão Simples Clicado\nSimples:"+simples+" Enfeitado: "+enfeitado,"click",JOptionPane.INFORMATION_MESSAGE);
            }else if(e.getSource()==botaoEnfeitado){
                enfeitado++;
                JOptionPane.showMessageDialog(null, String.format("Botão Enfeitado Clicado!\nSimples:%d Enfeitado:%d",simples,enfeitado),"click",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    
}
