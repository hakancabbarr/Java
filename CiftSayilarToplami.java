import java.util.Scanner;

public class CiftSayilarToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, toplam = 0;

        System.out.println("Girilen çift sayılardan 4'e tam bölünenleri toplar!");
        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = inp.nextInt();
            if ((sayi % 4 == 0) && (sayi % 2 == 0)) {
                toplam += sayi;
            }

        } while (sayi % 2 == 0);
        System.out.print("toplam = " + toplam);
        System.out.println("\nYanlış değer girdiniz!");
    }
}
