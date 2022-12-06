import java.util.Scanner;
public class Sinifgecme {
    public static void main(String[] args) {
        int ders1,ders2,ders3,ders4,ders5,toplam=0,dersSayisi=0;
        Scanner not = new Scanner(System.in);
        System.out.print("Lütfen matematik notunuzu giriniz: ");
        ders1 = not.nextInt();
        if(ders1<=0 || ders1<=100){
            toplam+=ders1;
            dersSayisi++ ;
        }
        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        ders2 = not.nextInt();
        if(ders2<=0 || ders2<=100){
            toplam+=ders2;
            dersSayisi++ ;
        }
        System.out.print("Lütfen fizik notunuzu giriniz: ");
        ders3 = not.nextInt();
        if(ders3<=0 || ders3<=100){
            toplam+=ders3;
            dersSayisi++ ;
        }
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        ders4 = not.nextInt();
        if(ders4<=0 || ders4<=100){
            toplam+=ders4;
            dersSayisi++ ;
        }
        System.out.print("Lütfen müzik notunuzu giriniz: ");
        ders5 = not.nextInt();
        if(ders5<=0 || ders5<=100){
            toplam+=ders5;
            dersSayisi++ ;
        }
        double ort = toplam / dersSayisi;

        if(ort>=55){
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }else{
            System.out.println("Üzgünüz, sınıfta kaldınız. ");
        }
        System.out.println("Dönem ortalamanız: " +ort);
    }
}