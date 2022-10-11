import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        double harmDeger = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = inp.nextInt();

        for (double i = 1; i <= sayi; i++) {

            harmDeger += 1 / i;
        }
        System.out.println("Sayının harmonik değeri: " + harmDeger);
    }
}