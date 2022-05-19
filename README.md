*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;*

- *Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.*
- *Kişi 12 yaşından küçükse bilet fiyatı üzerinden **%50** indirim uygulanır.*
- *Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden **%10** indirim uygulanır.*
- *Kişi 65 yaşından büyük ise bilet fiyatı üzerinden **%30** indirim uygulanır.*
- *Kişi "Yolculuk Tipini" **gidiş dönüş** seçmiş ise bilet fiyatı üzerinden **%20** indirim uygulanır.*

```java
import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km, yas, tip;
        System.out.print("Mesafeyi Girin :");
        km = scan.nextInt();
        System.out.print("Yaşınızı Girin :");
        yas = scan.nextInt();
        System.out.print("Yolculuk Tipini Seçiniz (1-Tek Gidiş , 2-Gidiş Dönüş) :");
        tip = scan.nextInt();
        
        double nfiyat , yasIndirim, gdIndirim;
        
        if(km>0 && yas>0 && (tip==1 || tip==2)) {
            nfiyat = km*0.1;
            if(yas<12) {
                yasIndirim = nfiyat*0.5 ;
                nfiyat = nfiyat - yasIndirim;
            } else if(yas >= 12 && yas<=24) {
                yasIndirim = nfiyat*0.1;
            } else if(yas >=65) {
                yasIndirim = nfiyat*0.3;
            }else {
                yasIndirim = 0;
            }
            nfiyat -= yasIndirim;
            if(tip ==2) {
                gdIndirim = nfiyat*0.2;
                nfiyat = (nfiyat - gdIndirim)*2;        
            }
            System.out.println("Toplam :" + nfiyat + "TL");
        } else {
            System.out.println("Girdiğiniz değerleri lütfen kontrol edin");
        }            
    }
}
```

