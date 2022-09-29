import java.util.Scanner;

public class VücutKitleEndeks {
   public static void main(String[] args) {
        
        double boy, kilo, endeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (Metre Cinsinden): ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu Giriniz (Kg Cinsinden): ");
        kilo = inp.nextDouble();

        endeks = kilo/(boy*boy);
        
        System.out.println("Vücut Kitle Endeksiniz: " + endeks);
   } 
}
