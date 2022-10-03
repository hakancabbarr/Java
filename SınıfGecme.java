import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {

        int mat, fiz, kimya, turk, müz, toplam = 0;
        double ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        if ((mat >= 0) && (mat <= 100)) {
            toplam += mat;
        }

        System.out.print("Fizik notunuz: ");
        fiz = inp.nextInt();
        if ((fiz >= 0) && (fiz <= 100)) {
            toplam += fiz;
        }

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        if ((kimya >= 0) && (kimya <= 100)) {
            toplam += kimya;
        }

        System.out.print("Türkçe notunuz: ");
        turk = inp.nextInt();
        if ((turk >= 0) && (turk <= 100)) {
            toplam += turk;
        }

        System.out.print("Müzik notunuz: ");
        müz = inp.nextInt();
        if ((müz >= 0) && (müz <= 100)) {
            toplam += müz;
        }

        ortalama = (toplam / 5);
        System.out.println(ortalama);
        if (ortalama > 55) {
            System.out.println("Ortalamanız geçme notunun üstünde!");
        } else {
            System.out.println("Ortalamanız geçme notunun altında!");
        }

    }
}
