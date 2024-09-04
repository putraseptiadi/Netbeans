/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coba1;

/**
 *
 * @author putra
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class Modul6 extends JFrame {

    private JList<String> makananList;
    private JList<String> minumanList;
    private JList<String> olahragaList;
    private JTextArea resumeArea;
    private JButton prosesButton;

    public Modul6() {
        initComponents();
    }

    private void initComponents() {
        // Data untuk JList
        String[] makanan = {"Nasi Goreng", "Sate", "Bakso", "Mie Ayam"};
        String[] minuman = {"Teh", "Kopi", "Jus", "Air Mineral"};
        String[] olahraga = {"Sepak Bola", "Basket", "Bulu Tangkis", "Renang", "Tenis"};

        // Inisialisasi JList dengan model selection yang sesuai
        makananList = new JList<>(makanan);
        makananList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        minumanList = new JList<>(minuman);
        minumanList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        
        olahragaList = new JList<>(olahraga);
        olahragaList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Inisialisasi JScrollPane
        JScrollPane makananScrollPane = new JScrollPane(makananList);
        JScrollPane minumanScrollPane = new JScrollPane(minumanList);
        JScrollPane olahragaScrollPane = new JScrollPane(olahragaList);

        // Inisialisasi JTextArea
        resumeArea = new JTextArea(10, 30);
        resumeArea.setEditable(false);
        JScrollPane resumeScrollPane = new JScrollPane(resumeArea);

        // Inisialisasi JButton
        prosesButton = new JButton("Proses");

        // Set layout dan tambahkan komponen
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Makanan:"), gbc);

        gbc.gridx = 1;
        add(makananScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Minuman:"), gbc);

        gbc.gridx = 1;
        add(minumanScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Olahraga:"), gbc);

        gbc.gridx = 1;
        add(olahragaScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(prosesButton, gbc);

        gbc.gridy = 4;
        add(resumeScrollPane, gbc);

        // Action listener untuk tombol proses
        prosesButton.addActionListener(e -> prosesButtonActionPerformed());

        // Set default operation dan size dari form
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setTitle("Form Pemesanan Cafe");
        setLocationRelativeTo(null);
    }

    private void prosesButtonActionPerformed() {
        // Ambil data yang dipilih dari setiap JList
        String makanan = makananList.getSelectedValue();
        String minuman = minumanList.getSelectedValuesList().toString();
        String olahraga = olahragaList.getSelectedValuesList().toString();

        // Tampilkan hasil di JTextArea
        resumeArea.setText("Makanan: " + makanan + "\n" +
                           "Minuman: " + minuman + "\n" +
                           "Olahraga: " + olahraga);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Modul6().setVisible(true));
    }

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

