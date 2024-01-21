import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DersKayitFormu extends JFrame {
    private JTextField dersKoduField;
    private JTextField dersAdField;
    private JTextField dersDonemField;
    private JTextField ogretimGorevlisiField;
    private JButton kaydetButton;

    public DersKayitFormu() {
        setTitle("Ders Formu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        dersKoduField = new JTextField(15);
        dersAdField = new JTextField(15);
        dersDonemField = new JTextField(15);
        ogretimGorevlisiField = new JTextField(15);

        kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kaydetButonuHandler();
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Ders Kodu:"));
        panel.add(dersKoduField);
        panel.add(new JLabel("Ders Adı:"));
        panel.add(dersAdField);
        panel.add(new JLabel("Dönem:"));
        panel.add(dersDonemField);
        panel.add(new JLabel("Öğretim Görevlisi:"));
        panel.add(ogretimGorevlisiField);
        panel.add(new JLabel(""));
        panel.add(kaydetButton);

        add(panel);
        setVisible(true);
    }

    private void kaydetButonuHandler() {
        String dersKodu = dersKoduField.getText();
        String dersAdi = dersAdField.getText();
        String dersDonemi = dersDonemField.getText();
        String ogretimGorevlisi = ogretimGorevlisiField.getText();

        String dersBilgisi = "Ders Kodu: " + dersKodu + ", Ders Adı: " + dersAdi +
                ", Dönem: " + dersDonemi + ", Öğretim Görevlisi: " + ogretimGorevlisi;

        VeriDeposu.dersListesi.add(dersBilgisi);

        JOptionPane.showMessageDialog(null, "Ders bilgisi başarıyla kaydedildi.");
        dispose();
    }
}
