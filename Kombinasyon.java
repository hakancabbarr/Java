import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        // a = (n-r)!, nF = n değerinin faktöriyeli, rF = r değerinin faktöriyeli

        int i, n, r, c, a = 1, nF = 1, rF = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir n değeri giriniz:");
        n = inp.nextInt();
        System.out.print("Bir r değeri giriniz:");
        r = inp.nextInt();
        if ((n >= 0) && (r >= 0)) {

            for (i = n; i > 0; i--) {

                nF = nF * i;
            }
            for (i = (n - r); i > 0; i--) {

                a = a * i;
            }
            for (i = r; i > 0; i--) {

                rF = rF * i;
            }
            c = nF / (rF * a);
            System.out.println(+n + " Kombinasyon " + r + " = " + c);

        } else {
            System.out.println("Girdiğiniz değerler yanlış, lütfen n ve r değerini pozitif giriniz!");
        }
    }
}
