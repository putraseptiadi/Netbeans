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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modul7 extends JFrame {

    private JTextArea areaKota;
    private JList<String> listMinuman;
    private JComboBox<String> comboMakanan;
    private JButton btTambah;
    private JButton btHapus;
    private JButton btUbah;
    private JButton btSisip;
    private JTextField eKota;
    private JTextField eMakanan;
    private JTextField eMinuman;

    public Modul7() {
        initComponents();
    }

    private void initComponents() {
        // Inisialisasi komponen
        areaKota = new JTextArea(10, 20);
        JScrollPane scrollPaneKota = new JScrollPane(areaKota);

        DefaultListModel<String> minumanModel = new DefaultListModel<>();
        listMinuman = new JList<>(minumanModel);
        JScrollPane scrollPaneMinuman = new JScrollPane(listMinuman);

        comboMakanan = new JComboBox<>();

        btTambah = new JButton("Tambah");
        btHapus = new JButton("Hapus");
        btUbah = new JButton("Ubah");
        btSisip = new JButton("Sisip");

        eKota = new JTextField(10);
        eMakanan = new JTextField(10);
        eMinuman = new JTextField(10);

        // Layout pengaturan
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Daftar Kota:"), gbc);

        gbc.gridx = 1;
        add(scrollPaneKota, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Daftar Minuman:"), gbc);

        gbc.gridx = 1;
        add(scrollPaneMinuman, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Daftar Makanan:"), gbc);

        gbc.gridx = 1;
        add(comboMakanan, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btTambah, gbc);

        gbc.gridy = 4;
        add(btSisip, gbc);

        gbc.gridy = 5;
        add(btHapus, gbc);

        gbc.gridy = 6;
        add(btUbah, gbc);

        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(new JLabel("Kota:"), gbc);

        gbc.gridx = 1;
        add(eKota, gbc);

        gbc.gridy = 8;
        gbc.gridx = 0;
        add(new JLabel("Makanan:"), gbc);

        gbc.gridx = 1;
        add(eMakanan, gbc);

        gbc.gridy = 9;
        gbc.gridx = 0;
        add(new JLabel("Minuman:"), gbc);

        gbc.gridx = 1;
        add(eMinuman, gbc);

        // Action Listeners
        btTambah.addActionListener(evt -> {
            areaKota.setText("Jakarta\nBandung\nSurabaya\n");
            comboMakanan.addItem("Nasi Goreng");
            comboMakanan.addItem("Soto");
            comboMakanan.addItem("Bakso");
            DefaultListModel<String> model = (DefaultListModel<String>) listMinuman.getModel();
            model.addElement("Teh");
            model.addElement("Kopi");
            model.addElement("Jus");
        });

        btSisip.addActionListener(evt -> {
            // Ambil input dari JTextField dan sisipkan ke komponen terkait
            String kotaInput = eKota.getText();
            String makananInput = eMakanan.getText();
            String minumanInput = eMinuman.getText();

            // Sisipkan kota ke areaKota
            if (!kotaInput.isEmpty()) {
                areaKota.insert(kotaInput + "\n", 0);
                eKota.setText(""); // Kosongkan input setelah sisip
            }

            // Sisipkan makanan ke JComboBox
            if (!makananInput.isEmpty() && !containsItem(comboMakanan, makananInput)) {
                comboMakanan.insertItemAt(makananInput, 0);
                eMakanan.setText(""); // Kosongkan input setelah sisip
            }

            // Sisipkan minuman ke ListMinuman
            if (!minumanInput.isEmpty() && !containsItem((DefaultListModel<String>) listMinuman.getModel(), minumanInput)) {
                DefaultListModel<String> model = (DefaultListModel<String>) listMinuman.getModel();
                model.add(0, minumanInput);
                eMinuman.setText(""); // Kosongkan input setelah sisip
            }
        });

        btHapus.addActionListener(evt -> {
            try {
                // Menghapus kota pertama
                String text = areaKota.getText();
                int index = text.indexOf('\n');
                if (index != -1) {
                    areaKota.setText(text.substring(index + 1));
                }

                // Menghapus makanan pertama
                if (comboMakanan.getItemCount() > 0) {
                    comboMakanan.removeItemAt(0);
                }

                // Menghapus minuman pertama
                DefaultListModel<String> model = (DefaultListModel<String>) listMinuman.getModel();
                if (model.getSize() > 0) {
                    model.remove(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Tidak ada item untuk dihapus");
            }
        });

        btUbah.addActionListener(evt -> {
            if (listMinuman.getSelectedIndex() != -1) {
                String newMinuman = eMinuman.getText();
                DefaultListModel<String> model = (DefaultListModel<String>) listMinuman.getModel();
                model.set(listMinuman.getSelectedIndex(), newMinuman);
                eMinuman.setText(""); // Kosongkan input setelah ubah
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih minuman yang akan diubah.");
            }
        });

        // Pengaturan form
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setTitle("Form Pesanan Cafe");
        setLocationRelativeTo(null);
    }

    // Helper method to check if item already exists in JComboBox
    private boolean containsItem(JComboBox<String> comboBox, String item) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getItemAt(i).equals(item)) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check if item already exists in JList
    private boolean containsItem(DefaultListModel<String> model, String item) {
        for (int i = 0; i < model.getSize(); i++) {
            if (model.getElementAt(i).equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Modul7().setVisible(true));
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
