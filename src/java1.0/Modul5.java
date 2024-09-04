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

public class Modul5 extends JFrame {

    private JTextField nameField, addressField;
    private JCheckBox pizzaCheckBox, burgerCheckBox, sodaCheckBox, coffeeCheckBox;
    private JTextArea orderSummaryArea;
    private JButton orderButton;

    public Modul5() {
        initComponents();
    }

    private void initComponents() {
        // Inisialisasi komponen
        JLabel nameLabel = new JLabel("Nama:");
        JLabel addressLabel = new JLabel("Alamat:");
        nameField = new JTextField(20);
        addressField = new JTextField(20);
        pizzaCheckBox = new JCheckBox("Pizza");
        burgerCheckBox = new JCheckBox("Burger");
        sodaCheckBox = new JCheckBox("Soda");
        coffeeCheckBox = new JCheckBox("Coffee");
        orderButton = new JButton("Pesan");
        orderSummaryArea = new JTextArea(10, 30);
        orderSummaryArea.setEditable(false);

        // Set layout menggunakan GridBagLayout untuk pengaturan yang lebih fleksibel
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Tambahkan komponen ke form dengan posisi yang diatur
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(addressLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(new JLabel("Makanan:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(pizzaCheckBox, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(burgerCheckBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Minuman:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(sodaCheckBox, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        add(coffeeCheckBox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(orderButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JScrollPane(orderSummaryArea), gbc);

        // Action listener untuk button pesan
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderButtonActionPerformed();
            }
        });

        // Set default operation dan size dari form
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Cafe Order Form");
        setLocationRelativeTo(null);
    }

    private void orderButtonActionPerformed() {
        // Ambil data dari inputan user
        String name = nameField.getText();
        String address = addressField.getText();
        StringBuilder order = new StringBuilder();

        // Cek makanan yang dipilih
        if (pizzaCheckBox.isSelected()) {
            order.append("Pizza\n");
        }
        if (burgerCheckBox.isSelected()) {
            order.append("Burger\n");
        }

        // Cek minuman yang dipilih
        if (sodaCheckBox.isSelected()) {
            order.append("Soda\n");
        }
        if (coffeeCheckBox.isSelected()) {
            order.append("Coffee\n");
        }

        // Tampilkan hasil pesanan di TextArea
        orderSummaryArea.setText("Nama: " + name + "\n" +
                                  "Alamat: " + address + "\n" +
                                  "Pesanan:\n" + order.toString());
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Modul5().setVisible(true));
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
