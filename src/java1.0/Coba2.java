/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coba1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coba2 {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Display Information");

        // Specify BorderLayout for the layout manager
        frame.setLayout(new BorderLayout(10, 10));

        // Give the frame an initial size
        frame.setSize(500, 400);

        // Terminate the program when the user closes the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the form
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create labels for NIM, Nama, Alamat, and No Telepon
        JLabel nimLabel = new JLabel("NIM:");
        JLabel namaLabel = new JLabel("Nama:");
        JLabel alamatLabel = new JLabel("Alamat:");
        JLabel noTlpLabel = new JLabel("No Telepon:");

        // Set font for labels
        Font labelFont = new Font("Arial", Font.BOLD, 14);
        nimLabel.setFont(labelFont);
        namaLabel.setFont(labelFont);
        alamatLabel.setFont(labelFont);
        noTlpLabel.setFont(labelFont);

        // Create text fields for NIM, Nama, Alamat, and No Telepon
        JTextField nimField = new JTextField(15);
        JTextField namaField = new JTextField(15);
        JTextField alamatField = new JTextField(15);
        JTextField noTlpField = new JTextField(15);

        // Add the labels and text fields to the panel
        panel.add(nimLabel);
        panel.add(nimField);
        panel.add(namaLabel);
        panel.add(namaField);
        panel.add(alamatLabel);
        panel.add(alamatField);
        panel.add(noTlpLabel);
        panel.add(noTlpField);

        // Create a button to display the information
        JButton displayButton = new JButton("Tampilkan Informasi");
        displayButton.setPreferredSize(new Dimension(160, 30)); // Set preferred size of the button

        // Create a text area to display the information
        JTextArea displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        displayArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Add action listener to the button
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = nimField.getText();
                String nama = namaField.getText();
                String alamat = alamatField.getText();
                String noTlp = noTlpField.getText();

                String info = "NIM: " + nim + "\n" +
                              "Nama: " + nama + "\n" +
                              "Alamat: " + alamat + "\n" +
                              "No Telepon: " + noTlp;

                displayArea.setText(info);
            }
        });

        // Create a panel for the button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(displayButton);

        // Add components to the frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);
    }
}

    @SuppressWarnings("unchecked")
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

