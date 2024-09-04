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

public class Modul12 extends JFrame {

    private JTextField eHasil;
    private JSlider jSlider1;
    private JSlider jSlider2;

    public Modul12() {
        initComponents();
    }

    private void initComponents() {
        // Inisialisasi komponen
        JLabel label = new JLabel("Hasil:");
        eHasil = new JTextField(10);
        jSlider1 = new JSlider(20, 70, 50);  // Min: 20, Max: 70, Initial: 50
        jSlider2 = new JSlider(0, 100, 50);  // Min: 0, Max: 100, Initial: 50
        JButton btnSetHasil = new JButton("Set Hasil");
        JButton btnUbahMinMax = new JButton("Ubah Min Max");
        JButton btnHapusLabel = new JButton("Hapus Label Nilai");

        // Set properties untuk slider
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(5);

        jSlider2.setPaintTicks(true);
        jSlider2.setPaintLabels(true);
        jSlider2.setMajorTickSpacing(10);
        jSlider2.setMinorTickSpacing(5);

        // Layout pengaturan
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(label, gbc);

        gbc.gridx = 1;
        add(eHasil, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(jSlider1, gbc);

        gbc.gridy = 2;
        add(jSlider2, gbc);

        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(btnSetHasil, gbc);

        gbc.gridx = 1;
        add(btnUbahMinMax, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        add(btnHapusLabel, gbc);

        // Action Listeners
        btnSetHasil.addActionListener(evt -> {
            int hasil = jSlider1.getValue();
            eHasil.setText(String.valueOf(hasil));
        });

        btnUbahMinMax.addActionListener(evt -> {
            int newMin = Integer.parseInt(JOptionPane.showInputDialog(this, "Masukkan nilai minimum baru:", jSlider1.getMinimum()));
            int newMax = Integer.parseInt(JOptionPane.showInputDialog(this, "Masukkan nilai maksimum baru:", jSlider1.getMaximum()));
            jSlider1.setMinimum(newMin);
            jSlider1.setMaximum(newMax);
        });

        btnHapusLabel.addActionListener(evt -> {
            jSlider1.setPaintLabels(false);
            jSlider2.setPaintLabels(false);
        });

        // Pengaturan form
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Slider Example");
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Modul12().setVisible(true));
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
