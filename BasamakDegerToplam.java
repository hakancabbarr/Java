import java.util.Scanner;

public class BasamakDegerToplam {
    public static void main(String[] args) {
        int basDeger = 0, basSayisi = 0, toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = inp.nextInt();

        while (sayi != 0) {
            basDeger = sayi % 10;
            basSayisi++;
            sayi /= 10;
            toplam += basDeger;
        }
        System.out.println("Sayısının basamak sayısı:" +basSayisi);
        System.out.println("Sayının basamaklarının sayı değerler toplamı: "+toplam);
    }
}
