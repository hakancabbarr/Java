import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args) {
        int n, k, deger=1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = inp.nextInt();
        System.out.print("Üssünü giriniz: ");
        k = inp.nextInt();

        for (int i=1 ; i<=k ; i++){
            deger = deger*n;
        }
        System.out.print(+n +" üssü "+k+" = "+deger );
    }
}
