import java.util.Scanner;

public class UcgendeHipotenus {
    public static void main(String[] args) {
        double cevre, hipotenus, alan , kenar1 , kenar2 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("1.Kenarı giriniz: ");
        kenar1 = inp.nextDouble();
        System.out.print("2.Kenarı giriniz: ");
        kenar2 = inp.nextDouble();   
        
        
        hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs uzunluğu: "+ hipotenus);
        
        cevre = kenar1 + kenar2 + hipotenus;
        System.out.println("Üçgenin Çevresi: "+ cevre);

        alan = (kenar1*kenar2)/2 ;
        System.out.println("Üçgenin Alanı: "+ alan);
        
        
    }

}
