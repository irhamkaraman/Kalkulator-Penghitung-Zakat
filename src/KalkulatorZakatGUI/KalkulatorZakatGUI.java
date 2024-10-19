package KalkulatorZakatGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class KalkulatorZakatGUI extends JFrame {
    private JTextField penghasilanField, emasField, asetLancarField, labaField;
    private JLabel hasilLabel;

    public KalkulatorZakatGUI() {
        setTitle("Kalkulator Zakat");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 10, 10));
        
        JLabel penghasilanLabel = new JLabel("Penghasilan per bulan:");
        add(penghasilanLabel);

        penghasilanField = new JTextField();
        add(penghasilanField);

        JButton hitungPenghasilanButton = new JButton("Hitung Zakat Penghasilan");
        add(hitungPenghasilanButton);

        hitungPenghasilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungZakatPenghasilan();
            }
        });

        JLabel emasLabel = new JLabel("Berat emas (gram):");
        add(emasLabel);

        emasField = new JTextField();
        add(emasField);

        JButton hitungEmasButton = new JButton("Hitung Zakat Emas");
        add(hitungEmasButton);

        hitungEmasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungZakatEmas();
            }
        });

        JLabel asetLancarLabel = new JLabel("Aset Lancar:");
        add(asetLancarLabel);

        asetLancarField = new JTextField();
        add(asetLancarField);

        JLabel labaLabel = new JLabel("Laba:");
        add(labaLabel);

        labaField = new JTextField();
        add(labaField);

        JButton hitungPerdaganganButton = new JButton("Hitung Zakat Perdagangan");
        add(hitungPerdaganganButton);

        hitungPerdaganganButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungZakatPerdagangan();
            }
        });

        hasilLabel = new JLabel("Hasil Zakat akan tampil di sini.");
        add(hasilLabel);
    }

    private void hitungZakatPenghasilan() {
        try {
            int penghasilan = Integer.parseInt(penghasilanField.getText());
            if (penghasilan <= 6859394) {
                hasilLabel.setText("Penghasilan tidak mencukupi syarat nisab zakat.");
            } else {
                double zakat = penghasilan * 2.5 / 100;
                hasilLabel.setText("Zakat Penghasilan: " + zakat + " Rupiah.");
            }
        } catch (NumberFormatException e) {
            hasilLabel.setText("Masukkan penghasilan yang valid.");
        }
    }

    private void hitungZakatEmas() {
        try {
            int beratEmas = Integer.parseInt(emasField.getText());
            if (beratEmas <= 85) {
                hasilLabel.setText("Emas tidak mencukupi syarat nisab.");
            } else {
                double zakatEmas = (beratEmas * 80000) * 2.5 / 100;
                hasilLabel.setText("Zakat Emas: " + zakatEmas + " Rupiah.");
            }
        } catch (NumberFormatException e) {
            hasilLabel.setText("Masukkan berat emas yang valid.");
        }
    }

    private void hitungZakatPerdagangan() {
        try {
            int asetLancar = Integer.parseInt(asetLancarField.getText());
            int laba = Integer.parseInt(labaField.getText());
            int totalAset = asetLancar + laba;

            if (totalAset >= 81945667) {
                double zakat = totalAset * 2.5 / 100;
                hasilLabel.setText("Zakat Perdagangan: " + zakat + " Rupiah.");
            } else {
                hasilLabel.setText("Aset tidak mencukupi syarat nisab zakat.");
            }
        } catch (NumberFormatException e) {
            hasilLabel.setText("Masukkan aset lancar dan laba yang valid.");
        }
    }

    public static void main(String[] args) {
        KalkulatorZakatGUI frame = new KalkulatorZakatGUI();
        
        frame.setVisible(true);
    }
}
