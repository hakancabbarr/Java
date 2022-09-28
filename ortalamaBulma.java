import java.util.Scanner;

public class ortalamaBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        float Matematik = input.nextFloat();

        System.out.print("Fizik Notunuz:");
        float Fizik = input.nextFloat();

        System.out.print("Kimya Notunuz:");
        float Kimya = input.nextFloat();

        System.out.print("Tarih Notunuz:");
        float Tarih = input.nextFloat();

        System.out.print("Türkçe Notunuz:");
        float Türkçe = input.nextFloat();

        System.out.print("Müzik Notunuz:");
        float Müzik = input.nextFloat();

    
        float notOrtalama = 0;
        notOrtalama = (Matematik + Fizik + Kimya + Tarih + Türkçe + Müzik)/6;
        System.out.println("Not Ortalamanız:" + notOrtalama);
    
    }
        

}
