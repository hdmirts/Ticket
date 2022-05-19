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