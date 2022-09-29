import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        
        double r, alan, cevre, pi=3.14, alpha;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        alpha = inp.nextDouble();

        cevre = 2*pi*r;
        alan = (alpha == 360) ? (pi*r*r) : (pi*r*r)*(alpha/360);
    
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Alanı: " + alan);
    
    }
}
