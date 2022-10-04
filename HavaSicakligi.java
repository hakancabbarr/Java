import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        //s = sıcaklık
        int s;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava kaç derece? :");
        s = inp.nextInt();

        if(s < 5){
            System.out.print("Kayağa Gidebilirsin");
        }else if((s>=5) && (s<=15)){
             System.out.print("Sinemeya Gidebilirsin");   
        }else if((s>=15) && (s<=25)){
             System.out.println("Pikniğe Gidebilirsin");
        }else{
            System.out.println("Yüzmeye Gidebilirsin");
        }
    }
}
