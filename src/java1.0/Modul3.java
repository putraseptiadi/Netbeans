/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coba1;

/**
 *
 * @author putra
 */
import javax.swing.*;
import java.awt.*;

public class Modul3 extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;
    private JPanel panel;

    public Modul3() {
        initComponents();
    }

    private void initComponents() {
        // Create and configure components
        panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        // Set layout
        panel.setLayout(new GridLayout(3, 2, 5, 5));

        // Add components to the panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(cancelButton);

        // Add action listeners
        loginButton.addActionListener(evt -> loginButtonActionPerformed());
        cancelButton.addActionListener(evt -> cancelButtonActionPerformed());

        // Configure frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setTitle("Login Form");
        setLocationRelativeTo(null);
        add(panel); // Add panel to the frame
    }

    private void loginButtonActionPerformed() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Display username and password in JOptionPane
        JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + password, 
                "Login Info", JOptionPane.INFORMATION_MESSAGE);

        // Validate login
        if (username.equals("sahrul") && password.equals("sahrul123")) {
            JOptionPane.showMessageDialog(this, "Selamat Anda Berhasil Login", 
                    "Login", JOptionPane.INFORMATION_MESSAGE);
            // Open another form
            new FormLain().setVisible(true);
            this.dispose(); // Close current login form
        } else {
            JOptionPane.showMessageDialog(this, "Maaf user dan Password Salah", 
                    "Login", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelButtonActionPerformed() {
        // Clear username and password fields
        usernameField.setText("");
        passwordField.setText("");
    }

    public JPanel getPanel() {
        return panel; // Return the panel containing all components
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Modul3().setVisible(true));
    }

    // Inner class FormLain as a form to be opened if login is successful
    private class FormLain extends JFrame {
        public FormLain() {
            JLabel label = new JLabel("Form Lain Berhasil Dibuka");
            add(label);
            setSize(200, 100);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setTitle("Form Lain");
            setLocationRelativeTo(null);
        }
    }
    
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
