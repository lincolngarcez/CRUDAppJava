/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudapp;

import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class CRUDApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Cria uma instância de MainFrame
                MainFrame mainFrame = new MainFrame();
                // Define o comportamento de fechamento do JFrame
                mainFrame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
                // Define o JFrame como visível
                mainFrame.setVisible(true);
            }
        });
    }
    
}
