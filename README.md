APP PROJESİ README
Bu proje, Java programlama dili ve Java Swing kütüphanesi kullanılarak geliştirilmiş basit bir öğrenci bilgi takip sistemi uygulamasıdır. Uygulama, öğrenci, ders ve öğretim üyesi bilgilerini giriş ve kayıt yapma, bu bilgileri takip etme, ayrıca kayıtları bir dosyaya yazma gibi temel işlevlere sahiptir.

İşlevselliğe dair ana bileşenler şunlardır:

1. **Ders Kayıt Formu**: Bu form, ders bilgilerini girmek için kullanılır. Ders kodu, adı, dönemi ve öğretim görevlisi gibi bilgileri içerir.

2. **Öğrenci Kayıt Formu**: Bu form, öğrenci bilgilerini girmek için kullanılır. Öğrenci numarası, adı, soyadı, bölümü ve aldığı dersler gibi bilgileri içerir.

3. **Öğretim Üyesi Kayıt Formu**: Bu form, öğretim üyesi bilgilerini girmek için kullanılır. Öğretim üyesi numarası, adı, soyadı, bölümü ve verdiği dersler gibi bilgileri içerir.

4. **Uygulama Formu**: Bu form, diğer formlara erişim sağlar. Ana menü niteliğindedir ve projedeki diğer formları çağırmak için kullanılır.

5. **SharedData Sınıfı**: Bu sınıf, uygulama içinde bilgilerin paylaşımını sağlar. Örneğin, dersleri bir listede saklamak ve farklı formlardan bu listeye erişmek için kullanılır.

6. **VeriDeposu Sınıfı**: Bu sınıf, kaydedilen bilgileri bir dosyaya yazmak için kullanılır. Projede kullanılan sınıfların veri depolama ve paylaşımını sağlar.

Uygulama başlatıldığında, kullanıcıya çeşitli form seçenekleri sunulur. Her bir form, gerekli bilgilerin girilmesine izin verir ve bu bilgilerin bir listesini tutar. Ayrıca, "Kayıtları Dosyaya Yaz" butonu ile bu bilgiler bir metin dosyasına yazılır.

Projede kullanılan temel Java ve Swing kavramları şunlardır:

- **Swing Kontrolleri (JFrame, JButton, JTextField, JComboBox, JLabel, JPanel)**: Formlarda kullanıcı etkileşimini sağlamak için kullanılmıştır.
  
- **Event Handling (ActionListener)**: Butonlara tıklandığında veya form elemanlarına girildiğinde yapılacak işlemleri tanımlamak için kullanılmıştır.

- **Listeler (ArrayList)**: Ders, öğrenci ve öğretim üyesi bilgilerini tutmak için kullanılmıştır.

- **Dosya İ/O İşlemleri**: Verilerin bir dosyaya yazılması ve okunması için kullanılmıştır.
