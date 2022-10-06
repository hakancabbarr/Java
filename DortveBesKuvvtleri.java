import java.util.Scanner;

public class DortveBesKuvvtleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;

        System.out.print("Sınır değerini giriniz: ");
        sayi = inp.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + "\n");
        }
        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.print("\n" + i);
        }
    }
}
