import java.util.Scanner;

public class TaksimetreTutar {
    public static void main(String[] args) {
        double yol, ucret;
        double kmTutari = 2.2;
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Taksimetre açılış ücreti 10TL'dir");
        System.out.print("Gidilen yolu giriniz (KM cinsinden): ");
        yol = inp.nextFloat();
        
        ucret = ((yol*kmTutari)+10) <= 20 ? 20 : ((yol*kmTutari)+10);
        System.out.println("Taksimetre Tutarı: " + ucret + "TL");
    }
}
