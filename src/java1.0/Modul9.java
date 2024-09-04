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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modul9 extends JFrame {
    private JTextField eData1, eData2, eHasil;
    private JMenuBar menuBar;
    private JMenu menuHitung;
    private JMenuItem menuItemPersegiPanjang, menuItemSegitiga, menuItemLingkaran;
    private JSeparator separator;

    public Modul9() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Geometry Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel labelData1 = new JLabel("Data 1:");
        labelData1.setBounds(20, 30, 100, 25);
        add(labelData1);

        eData1 = new JTextField();
        eData1.setBounds(120, 30, 200, 25);
        add(eData1);

        JLabel labelData2 = new JLabel("Data 2:");
        labelData2.setBounds(20, 70, 100, 25);
        add(labelData2);

        eData2 = new JTextField();
        eData2.setBounds(120, 70, 200, 25);
        add(eData2);

        JLabel labelHasil = new JLabel("Hasil:");
        labelHasil.setBounds(20, 110, 100, 25);
        add(labelHasil);

        eHasil = new JTextField();
        eHasil.setBounds(120, 110, 200, 25);
        add(eHasil);

        // Setup Menu
        menuBar = new JMenuBar();
        menuHitung = new JMenu("Hitung");
        menuBar.add(menuHitung);

        menuItemPersegiPanjang = new JMenuItem("Persegi Panjang");
        menuHitung.add(menuItemPersegiPanjang);
        menuItemPersegiPanjang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungPersegiPanjang();
            }
        });

        separator = new JSeparator();
        menuHitung.add(separator);

        menuItemSegitiga = new JMenuItem("Segitiga");
        menuHitung.add(menuItemSegitiga);
        menuItemSegitiga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungSegitiga();
            }
        });

        separator = new JSeparator();
        menuHitung.add(separator);

        menuItemLingkaran = new JMenuItem("Lingkaran");
        menuHitung.add(menuItemLingkaran);
        menuItemLingkaran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungLingkaran();
            }
        });

        setJMenuBar(menuBar);
    }

    private void hitungPersegiPanjang() {
        int panjang = Integer.parseInt(eData1.getText());
        int lebar = Integer.parseInt(eData2.getText());
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        eHasil.setText("Luas: " + luas + ", Keliling: " + keliling);
    }

    private void hitungSegitiga() {
        int alas = Integer.parseInt(eData1.getText());
        int tinggi = Integer.parseInt(eData2.getText());
        double luas = 0.5 * alas * tinggi;
        double keliling = alas + 2 * Math.sqrt(Math.pow(alas / 2.0, 2) + Math.pow(tinggi, 2));
        eHasil.setText("Luas: " + luas + ", Keliling: " + keliling);
    }

    private void hitungLingkaran() {
        int jariJari = Integer.parseInt(eData1.getText());
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;
        eHasil.setText("Luas: " + luas + ", Keliling: " + keliling);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Modul9().setVisible(true));
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
