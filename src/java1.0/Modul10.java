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

public class Modul10 extends JFrame {
    private JSlider sbVolume, sbBas, sbTreble;
    private JTextArea areaResume;
    private JSpinner spinAngka, spinNormal, spinHari, spinTanggal;

    public Modul10() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Audio Settings");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel labelVolume = new JLabel("Volume:");
        labelVolume.setBounds(20, 20, 100, 25);
        add(labelVolume);

        sbVolume = new JSlider(0, 100, 50);
        sbVolume.setBounds(150, 20, 300, 25);
        add(sbVolume);

        JLabel labelBas = new JLabel("Bas:");
        labelBas.setBounds(20, 60, 100, 25);
        add(labelBas);

        sbBas = new JSlider(0, 100, 50);
        sbBas.setBounds(150, 60, 300, 25);
        add(sbBas);

        JLabel labelTreble = new JLabel("Treble:");
        labelTreble.setBounds(20, 100, 100, 25);
        add(labelTreble);

        sbTreble = new JSlider(0, 100, 50);
        sbTreble.setBounds(150, 100, 300, 25);
        add(sbTreble);

        JLabel labelAngka = new JLabel("Angka:");
        labelAngka.setBounds(20, 140, 100, 25);
        add(labelAngka);

        spinAngka = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        spinAngka.setBounds(150, 140, 100, 25);
        add(spinAngka);

        JLabel labelNormal = new JLabel("Normal:");
        labelNormal.setBounds(20, 180, 100, 25);
        add(labelNormal);

        spinNormal = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        spinNormal.setBounds(150, 180, 100, 25);
        add(spinNormal);

        JLabel labelHari = new JLabel("Hari:");
        labelHari.setBounds(20, 220, 100, 25);
        add(labelHari);

        spinHari = new JSpinner(new SpinnerListModel(new String[]{"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"}));
        spinHari.setBounds(150, 220, 100, 25);
        add(spinHari);

        JLabel labelTanggal = new JLabel("Tanggal:");
        labelTanggal.setBounds(20, 260, 100, 25);
        add(labelTanggal);

        spinTanggal = new JSpinner(new SpinnerDateModel());
        spinTanggal.setBounds(150, 260, 150, 25);
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinTanggal, "dd-MM-yyyy");
        spinTanggal.setEditor(dateEditor);
        add(spinTanggal);

        JButton btSubmit = new JButton("Submit");
        btSubmit.setBounds(20, 300, 430, 25);
        btSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResume();
            }
        });
        add(btSubmit);

        areaResume = new JTextArea();
        areaResume.setBounds(20, 340, 450, 100);
        add(areaResume);
    }

    private void updateResume() {
        areaResume.setText("Volume : \t" + sbVolume.getValue() + "\n" + 
                           "Bas : \t" + sbBas.getValue() + "\n" + 
                           "Treble : \t" + sbTreble.getValue() + "\n" + 
                           "Angka : \t" + spinAngka.getValue() + "\n" + 
                           "Normal : \t" + spinNormal.getValue() + "\n" + 
                           "Hari : \t" + spinHari.getValue() + "\n" + 
                           "Tanggal : \t" + ((JSpinner.DateEditor) spinTanggal.getEditor()).getFormat().format(spinTanggal.getValue()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Modul10().setVisible(true));
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

