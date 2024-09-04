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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Modul11 extends JFrame {
    private JTextField eNIM, eNAMA;
    private JTextArea areaKeterangan;
    private JToolBar toolBar;
    private JButton btnClear;
    private JPopupMenu popupMenu;
    private JMenuItem menuItemClear;

    public Modul11() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Student Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Field NIM
        JLabel labelNIM = new JLabel("NIM:");
        labelNIM.setBounds(20, 20, 100, 25);
        add(labelNIM);

        eNIM = new JTextField();
        eNIM.setBounds(120, 20, 200, 25);
        add(eNIM);

        // Field Nama
        JLabel labelNAMA = new JLabel("Nama:");
        labelNAMA.setBounds(20, 60, 100, 25);
        add(labelNAMA);

        eNAMA = new JTextField();
        eNAMA.setBounds(120, 60, 200, 25);
        add(eNAMA);

        // Area Keterangan
        JLabel labelKeterangan = new JLabel("Keterangan:");
        labelKeterangan.setBounds(20, 100, 100, 25);
        add(labelKeterangan);

        areaKeterangan = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaKeterangan);
        scrollPane.setBounds(120, 100, 200, 100);
        add(scrollPane);

        // Toolbar
        toolBar = new JToolBar();
        toolBar.setBounds(0, 0, 400, 30);
        add(toolBar);

        btnClear = new JButton("Clear");
        toolBar.add(btnClear);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // Popup Menu
        popupMenu = new JPopupMenu();
        menuItemClear = new JMenuItem("Clear Fields");
        popupMenu.add(menuItemClear);

        menuItemClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // Add mouse listener for popup menu
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        setJMenuBar(createMenuBar());
    }

    private void clearFields() {
        eNIM.setText("");
        eNAMA.setText("");
        areaKeterangan.setText("");
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuExit = new JMenuItem("Exit");

        menuExit.addActionListener(e -> System.exit(0));

        menuFile.add(menuExit);
        menuBar.add(menuFile);
        return menuBar;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Modul11().setVisible(true));
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

