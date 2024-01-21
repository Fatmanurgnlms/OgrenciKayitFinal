import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class OgrenciKayitFormu extends JFrame {
    private JTextField ogrenciNoField;
    private JTextField adField;
    private JTextField soyadField;
    private JTextField bolumField;
    private JComboBox<String> alinanDerslerComboBox;
    private JButton kaydetButton;

    public OgrenciKayitFormu() {
        setTitle("Öğrenci Formu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ogrenciNoField = new JTextField(15);
        adField = new JTextField(15);
        soyadField = new JTextField(15);
        bolumField = new JTextField(15);

        List<String> dersler = VeriDeposu.dersListesi;
        alinanDerslerComboBox = new JComboBox<>(dersler.toArray(new String[0]));

        kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kaydetButonuHandler();
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("Öğrenci No:"));
        panel.add(ogrenciNoField);
        panel.add(new JLabel("Ad:"));
        panel.add(adField);
        panel.add(new JLabel("Soyad:"));
        panel.add(soyadField);
        panel.add(new JLabel("Bölüm:"));
        panel.add(bolumField);
        panel.add(new JLabel("Alınan Ders:"));
        panel.add(alinanDerslerComboBox);
        panel.add(new JLabel(""));
        panel.add(kaydetButton);

        add(panel);
        setVisible(true);
    }

    private void kaydetButonuHandler() {
        String ogrenciNo = ogrenciNoField.getText();
        String ad = adField.getText();
        String soyad = soyadField.getText();
        String bolum = bolumField.getText();
        String alinanDers = (String) alinanDerslerComboBox.getSelectedItem();

        String ogrenciBilgisi = "Öğrenci No: " + ogrenciNo + ", Ad: " + ad + ", Soyad: " + soyad +
                ", Bölüm: " + bolum + ", Alınan Ders: " + alinanDers;

        VeriDeposu.ogrenciBilgileri.add(ogrenciBilgisi);

        JOptionPane.showMessageDialog(null, "Öğrenci bilgisi başarıyla kaydedildi.");
        dispose();
    }
}
