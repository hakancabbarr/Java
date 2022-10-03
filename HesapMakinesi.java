import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double num1 , num2 , secim;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        num1 = inp.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        num2 = inp.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz: ");
        secim = inp.nextInt();

        switch(secim){
        
        case 1: 
        System.out.println("Toplam Sonucu=" + (num1 + num2));
        break;
        case 2:
        System.out.println("Çıkarma Sonucu=" + (num1 - num2));
        break;
        case 3:
        System.out.println("Çarpım Sonucu=" + (num1*num2));
        break;
        case 4:
        System.out.println("Bölme Sonucu=" + (num1 / num2));
        break;

        default:
        System.out.println("Yanlış değer:");
    }
    }
}
