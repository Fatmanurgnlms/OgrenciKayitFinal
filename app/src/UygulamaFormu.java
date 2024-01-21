import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UygulamaFormu extends JFrame {
    private JButton dersFormuButton;
    private JButton ogrenciFormuButton;
    private JButton ogretimUyesiFormuButton;
    private JButton kayitlariDosyayaYazButton;

    public UygulamaFormu() {
        setTitle("Uygulama Formu");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dersFormuButton = new JButton("Ders Formu");
        dersFormuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DersKayitFormu();
            }
        });

        ogrenciFormuButton = new JButton("Öğrenci Formu");
        ogrenciFormuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OgrenciKayitFormu();
            }
        });

        ogretimUyesiFormuButton = new JButton("Öğretim Üyesi Formu");
        ogretimUyesiFormuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OgretimUyesiKayitFormu();
            }
        });

        kayitlariDosyayaYazButton = new JButton("Kayıtları Dosyaya Yaz");
        kayitlariDosyayaYazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VeriDeposu.kayitlariDosyayaYaz();
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(dersFormuButton);
        panel.add(ogrenciFormuButton);
        panel.add(ogretimUyesiFormuButton);
        panel.add(kayitlariDosyayaYazButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UygulamaFormu();
            }
        });
    }
}
