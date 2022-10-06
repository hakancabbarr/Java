import java.util.Scanner;

public class UcveDordeBolunme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, ortalama;
        int ortakBolen = 0;
        int toplam = 0;

        System.out.print("Bir sayı giriniz:");
        sayi = inp.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam = (toplam + i);
                ortakBolen++;
            }
        }
        System.out.println("toplam= " + toplam);
        ortalama = (toplam / ortakBolen);
        System.out.println("ortalama= " + ortalama);
    }
}
