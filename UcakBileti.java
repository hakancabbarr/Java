import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        // m:mesafe , y:yaş , iT:indirimli tutar , t:tutar , yT:yolculuk tipi
        int m, y;
        double iT, t, yT;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi KM olarak giriniz:");
        m = inp.nextInt();
        System.out.print("Yaşınızı giriniz:");
        y = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (Tek yön -> 1 , Gidiş-Dönüş -> 2)");
        yT = inp.nextDouble();

        t = m * 0.10;

        if (m < 0) {
            System.out.println("Yanlış değer girdiniz");
        }
        if (y < 0) {
            System.out.println("Yanlış değer girdiniz");
        }
        if ((yT != 1) && (yT != 2)) {
            System.out.println("Yanlış değer girdiniz");
        }
        if ((yT == 1) && (m > 0) && (y > 0)) {
            if (y < 12) {
                t = (t - (t * 0.5));
            } else if ((y >= 12) && (y < 24)) {
                t = (t - (t * 0.1));
            } else if (y > 65) {
                t = (t - (t * 0.3));
            } else {
                t = t;
            }
            System.out.println("tutar = " + t);
        }

        if ((yT == 2) && (m > 0) && (y > 0)) {
            if (y < 12) {
                t = (t - (t * 0.5));
            } else if ((y >= 12) && (y < 24)) {
                t = (t - (t * 0.1));
            } else if (y > 65) {
                t = (t - (t * 0.3));
            } else if ((y > 24) && (y < 65)) {
                t = t;
            } else {
                System.out.println("Yanlış değer girdiniz!");
            }
            System.out.println("tutar = " + (t - (t * 0.2)) * 2);
        }

    }
}
