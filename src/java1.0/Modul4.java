/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coba1;

import javax.swing.JPanel;

/**
 *
 * @author putra
 */
public class Modul4 extends javax.swing.JFrame {

    public Modul4() {
        initComponents();
        
        // Tambahkan ActionListener untuk tombol Tampilkan
        jButtonTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTampilkanActionPerformed(evt);
            }
        });
    }

    private void initComponents() {

        jComboBoxMakanan = new javax.swing.JComboBox<>();
        jComboBoxMinuman = new javax.swing.JComboBox<>();
        jComboBoxSayuran = new javax.swing.JComboBox<>();
        jButtonTampilkan = new javax.swing.JButton();
        jTextFieldHasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Menambahkan item pada ComboBox
        jComboBoxMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nasi Goreng", "Mie Ayam", "Soto" }));
        jComboBoxMinuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teh Manis", "Jus Jeruk", "Air Putih" }));
        jComboBoxSayuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bayam", "Kangkung", "Wortel" }));

        jButtonTampilkan.setText("Tampilkan");

        // Mengatur layout menggunakan GroupLayout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxMakanan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMinuman, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSayuran, 0, 150, Short.MAX_VALUE)
                    .addComponent(jTextFieldHasil))
                .addGap(18, 18, 18)
                .addComponent(jButtonTampilkan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jComboBoxMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSayuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTampilkan)
                    .addComponent(jTextFieldHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtonTampilkanActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // Mengambil item yang dipilih dari setiap ComboBox
        String makanan = jComboBoxMakanan.getSelectedItem().toString();
        String minuman = jComboBoxMinuman.getSelectedItem().toString();
        String sayuran = jComboBoxSayuran.getSelectedItem().toString();

        // Menggabungkan item-item tersebut
        String hasil = "Makanan: " + makanan + ", Minuman: " + minuman + ", Sayuran: " + sayuran;

        // Menampilkan hasil di TextField
        jTextFieldHasil.setText(hasil);
    }    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul4().setVisible(true);
            }
        });
        
        
    }
    
   

    // Variables declaration
    private javax.swing.JButton jButtonTampilkan;
    private javax.swing.JComboBox<String> jComboBoxMakanan;
    private javax.swing.JComboBox<String> jComboBoxMinuman;
    private javax.swing.JComboBox<String> jComboBoxSayuran;
    private javax.swing.JTextField jTextFieldHasil;
    // End of variables declaration                   

    JPanel getPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
