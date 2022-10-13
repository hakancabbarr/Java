import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {

        int n, sayi, enBuyukSayi = 0, enKucukSayi = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz? :");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(+i+"."+"Sayı:");
            sayi = inp.nextInt();
            if (n == 1) {
                enBuyukSayi = sayi;
                enKucukSayi = sayi;
            } else {
                if (sayi > enBuyukSayi) {
                    enBuyukSayi = sayi;
                } else if (sayi < enBuyukSayi) {
                    enKucukSayi = sayi;
                }
            }
        }
        System.out.print("En büyük sayı: " + enBuyukSayi);
        System.out.print("\nEn küçük sayı: " + enKucukSayi);
    }
}
