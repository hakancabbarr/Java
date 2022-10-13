import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        int n, toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        n = inp.nextInt();

        if (n > 1) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    toplam += i;
                }
            }
        System.out.println(+n + " sayısı Mükemmel Sayıdır.");
        } else {
            System.out.println(+n + " sayısı Mükemmel Sayı değildir.");
        }

    }
}
