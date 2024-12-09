package ro.ugal.facultate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FacultateApp {

    static class Client {
        String nume;
        String prenume;
        int suprafataFerestre;
        String tipSticla;

        public Client(String nume, String prenume, int suprafataFerestre, String tipSticla) {
            this.nume = nume;
            this.prenume = prenume;
            this.suprafataFerestre = suprafataFerestre;
            this.tipSticla = tipSticla;
        }
    }

    private static final List<Client> clienti = new ArrayList<>();

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Gestionare Clienti - Termopane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        JLabel nameLabel = new JLabel("Nume:");
        JTextField nameField = new JTextField();
        JLabel surnameLabel = new JLabel("Prenume:");
        JTextField surnameField = new JTextField();
        JLabel surfaceLabel = new JLabel("Suprafata Ferestre:");
        JTextField surfaceField = new JTextField();
        JLabel glassTypeLabel = new JLabel("Tip Sticla:");
        JTextField glassTypeField = new JTextField();
        JButton addButton = new JButton("Adauga Client");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(surnameLabel);
        inputPanel.add(surnameField);
        inputPanel.add(surfaceLabel);
        inputPanel.add(surfaceField);
        inputPanel.add(glassTypeLabel);
        inputPanel.add(glassTypeField);
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        String[] columnNames = {"Nume", "Prenume", "Suprafata", "Tip Sticla"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        frame.add(tableScrollPane, BorderLayout.CENTER);

        JPanel actionPanel = new JPanel(new FlowLayout());
        JButton filterButton = new JButton("Filtreaza");
        JButton deleteButton = new JButton("Sterge randul selectat");

        actionPanel.add(filterButton);
        actionPanel.add(deleteButton);

        frame.add(actionPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = nameField.getText();
                String prenume = surnameField.getText();
                String suprafataText = surfaceField.getText();
                String tipSticla = glassTypeField.getText();

                if (nume.isEmpty() || prenume.isEmpty() || suprafataText.isEmpty() || tipSticla.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Completeaza toate campurile", "Eroare", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        int suprafata = Integer.parseInt(suprafataText);
                        Client client = new Client(nume, prenume, suprafata, tipSticla);
                        clienti.add(client);
                        tableModel.addRow(new Object[]{nume, prenume, suprafata, tipSticla});
                        nameField.setText("");
                        surnameField.setText("");
                        surfaceField.setText("");
                        glassTypeField.setText("");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Suprafata trebuie sa fie un numar", "Eroare", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    clienti.remove(selectedRow); // Ștergem din lista de clienți
                    tableModel.removeRow(selectedRow); // Ștergem rândul din tabel
                } else {
                    JOptionPane.showMessageDialog(frame, "Selecteaza un rand pentru a-l sterge.", "Eroare", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String suprafataMinimaText = JOptionPane.showInputDialog(frame, "Introduceti suprafata minima:");
                String tipSticlaCautata = JOptionPane.showInputDialog(frame, "Introduceti tipul de sticla:");

                if (suprafataMinimaText != null && tipSticlaCautata != null) {
                    try {
                        int suprafataMinima = Integer.parseInt(suprafataMinimaText);
                        DefaultTableModel filterModel = new DefaultTableModel(columnNames, 0);
                        for (Client client : clienti) {
                            if (client.suprafataFerestre >= suprafataMinima && client.tipSticla.equalsIgnoreCase(tipSticlaCautata)) {
                                filterModel.addRow(new Object[]{client.nume, client.prenume, client.suprafataFerestre, client.tipSticla});
                            }
                        }
                        table.setModel(filterModel);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Suprafata trebuie sa fie un numar", "Eroare", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}
