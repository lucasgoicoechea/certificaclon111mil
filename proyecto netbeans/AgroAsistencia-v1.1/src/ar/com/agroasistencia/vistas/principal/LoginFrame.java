/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.agroasistencia.vistas.principal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends javax.swing.JFrame {
    static JFrame frame = new JFrame("LOGIN");
    public static String usuarioLogueado = "ANONIMO";
    static JTextField userText;
    
    public static void main(String[] args) {
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        frame.setLocationRelativeTo(null) ;
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setText("ANONIMO");
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Clave");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginFrame.jButtonLoginButtonActionPerformed(evt);
            }
        });
        panel.add(loginButton);

        JButton registerButton = new JButton("Registrar");
        registerButton.setBounds(180, 80, 80, 25);
        panel.add(registerButton);
    }

    private static void jButtonLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
           //falta hacer el logueo con la BD
           if(logueoBien()){
             usuarioLogueado = userText.getText();
              new MenuFrame().setVisible(true);
              frame.setVisible(false);
           }
           else{
               JOptionPane.showMessageDialog(frame, "FALLO EL LOGUEO");
           }
           
    }

    private static boolean logueoBien() {
        return true;
    }

}
