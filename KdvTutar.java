import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        double tutar , kdv ;
    
    Scanner inp = new Scanner(System.in);
    System.out.print("Tutarı Giriniz: ");
    tutar = inp.nextDouble();
    kdv = tutar <=1000 ? (tutar * 0.18) : (tutar * 0.08);
    
    System.out.println("Kdv tutarı: " +kdv +"TL");
    System.out.println("Toplam tutar: " + (tutar+kdv) + "TL" );

    }
}
