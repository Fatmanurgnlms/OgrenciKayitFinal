import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class OgretimUyesiKayitFormu extends JFrame {
    private JTextField ogretmenNoField;
    private JTextField adField;
    private JTextField soyadField;
    private JTextField bolumField;
    private JComboBox<String> verdigiDerslerComboBox;
    private JButton kaydetButton;

    public OgretimUyesiKayitFormu() {
        setTitle("Öğretim Üyesi Formu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ogretmenNoField = new JTextField(15);
        adField = new JTextField(15);
        soyadField = new JTextField(15);
        bolumField = new JTextField(15);

        List<String> dersler = VeriDeposu.dersListesi;
        verdigiDerslerComboBox = new JComboBox<>(dersler.toArray(new String[0]));

        kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kaydetButonuHandler();
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("Öğretmen No:"));
        panel.add(ogretmenNoField);
        panel.add(new JLabel("Ad:"));
        panel.add(adField);
        panel.add(new JLabel("Soyad:"));
        panel.add(soyadField);
        panel.add(new JLabel("Bölüm:"));
        panel.add(bolumField);
        panel.add(new JLabel("Verdiği Ders:"));
        panel.add(verdigiDerslerComboBox);
        panel.add(new JLabel(""));
        panel.add(kaydetButton);

        add(panel);
        setVisible(true);
    }

    private void kaydetButonuHandler() {
        String ogretmenNo = ogretmenNoField.getText();
        String ad = adField.getText();
        String soyad = soyadField.getText();
        String bolum = bolumField.getText();
        String verilenDers = (String) verdigiDerslerComboBox.getSelectedItem();

        String ogretimUyesiBilgisi = "Öğretmen No: " + ogretmenNo + ", Ad: " + ad + ", Soyad: " + soyad +
                ", Bölüm: " + bolum + ", Verdiği Ders: " + verilenDers;

        VeriDeposu.ogretimUyesiBilgileri.add(ogretimUyesiBilgisi);

        JOptionPane.showMessageDialog(null, "Öğretim üyesi bilgisi başarıyla kaydedildi.");
        dispose();
    }
}
