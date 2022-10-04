import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int ay, gun;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaçıncı ayda olduğunuzu giriniz: ");
        ay = inp.nextInt();
        System.out.print("Ayın kaçıncı günündesiniz? : ");
        gun = inp.nextInt();

        if(ay == 1){
            if((gun>=22) && (gun <= 30)){
                System.out.print("Kova Burcusunuz!");
            }
        }else if(ay == 2){
            if((gun>=1) && (gun <= 19)){
                System.out.print("Kova Burcusunuz");
            }
        }else if(ay == 2){
            if((gun>=20) && (gun <= 29)){
                System.out.print("Balık Burcusunuz!");
            }
        }else if(ay == 3){
            if((gun>=1) && (gun <= 20)){
                System.out.print("Balık Burcusunuz!");
            }
        }else if(ay == 3){
            if((gun>=21) && (gun <= 31)){
                System.out.print("Koç Burcusunuz!");
            }
        }else if(ay == 4){
            if((gun>=1) && (gun <= 20)){
                System.out.print("Koç Burcusunuz!");
            }
        }else if(ay == 4){
            if((gun>=21) && (gun <= 30)){
                System.out.print("Boğa Burcusunuz!");
            }
        }else if(ay == 5){
            if((gun>=1) && (gun <= 21)){
                System.out.print("Boğa Burcusunuz");
            }
        }else if(ay == 5){
            if((gun>=22) && (gun <= 31)){
                System.out.print("İkizler Burcusunuz!");
            }
        }else if(ay == 6){
            if((gun>=1) && (gun <= 22)){
                System.out.print("İkizler Burcusunuz");
            }
        }else if(ay == 6){
            if((gun>=23) && (gun <= 30)){
                System.out.print("Yengeç Burcusunuz!");
            }
        }else if(ay == 7){
            if((gun>=1) && (gun <= 22)){
                System.out.print("Yengeç Burcusunuz");
            }
        }else if(ay == 7){
            if((gun>=23) && (gun <= 31)){
                System.out.print("Aslan Burcusunuz!");
            }
        }else if(ay == 8){
            if((gun>=1) && (gun <= 22)){
                System.out.print("Aslan Burcusunuz!");
            }
        }else if(ay == 8){
            if((gun>=23) && (gun <= 31)){
                System.out.print("Başak Burcusunuz!");
            }
        }else if(ay == 9){
            if((gun>=1) && (gun <= 22)){
                System.out.print("Başak Burcusunuz!");
            }
        }else if(ay == 9){
            if((gun>=23) && (gun <= 30)){
                System.out.print("Terazi Burcusunuz!");
            }
        }else if(ay == 10){
            if((gun>=1) && (gun <= 22)){
                System.out.print("Terazi Burcusunuz!");
            }
        }else if(ay == 10){
            if((gun>=23) && (gun <= 30)){
                System.out.print("Akrep Burcusunuz!");
            }
        }else if(ay == 11){
            if((gun>=1) && (gun <= 21)){
                System.out.print("Akrep Burcusunuz!");
            }
        }else if(ay == 11){
            if((gun>=22) && (gun <= 30)){
                System.out.print("Yay Burcusunuz!");
            }
        }else if(ay == 12){
            if((gun>=1) && (gun <= 21)){
                System.out.print("Yay Burcusunuz!");
            }
        }else if(ay == 12){
            if((gun>=22) && (gun <= 31)){
                System.out.print("Yengeç Burcusunuz");
            }
        }
    }
}
