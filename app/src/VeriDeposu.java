import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class VeriDeposu {
    public static List<String> dersListesi = new ArrayList<>();
    public static List<String> ogrenciBilgileri = new ArrayList<>();
    public static List<String> ogretimUyesiBilgileri = new ArrayList<>();

    public static void kayitlariDosyayaYaz() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String ders : dersListesi) {
                writer.write("Ders: " + ders + "\n");
            }

            for (String ogrenci : ogrenciBilgileri) {
                writer.write("Öğrenci: " + ogrenci + "\n");
            }

            for (String ogretimUyesi : ogretimUyesiBilgileri) {
                writer.write("Öğretim Üyesi: " + ogretimUyesi + "\n");
            }

            System.out.println("Bilgiler başarıyla dosyaya yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Dosya yazma hatası oluştu.");
        }
    }
}
