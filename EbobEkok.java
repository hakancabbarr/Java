import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2;

        Scanner inp = new Scanner(System.in);

        System.out.print("n1 değerini giriniz:");
        n1 = inp.nextInt();

        System.out.print("n2 değerini giriniz:");
        n2 = inp.nextInt();

        if (n1 > 0 && n2 > 0) {

            int i = n1;

            while (i >= 1) {

                if ((n1 % i == 0) && (n2 % i == 0)) {
                    System.out.println("EBOB:" + i);
                    break;
                } else {
                    i--;
                }
            }

            int j = n2;

            while (j <= (n1 * n2)) {
                if ((j % n1 == 0) && (j % n2 == 0)) {
                    System.out.println("EKOK:" + j);
                    break;
                } else {
                    j++;
                }
            }
        }else{
            System.out.println("Lütfen n1 ve n2 değerini pozitif değer giriniz.");
        }
    }
}
