import java.util.Scanner;

public class ATMProje {
    public static void main(String[] args) {

        String userName, password;
        Scanner inp = new Scanner(System.in);
        int deneme = 3;
        int bakiye = 5000;
        int secim;
        while (deneme > 0) {

            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();

            
            if (userName.equals("Hakan") && password.equals("hakan123")) {
            System.out.print("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Öğrenme\n4-Çıkış\nSeçiminiz:");
            secim = inp.nextInt();

            
            switch(secim){
                case 1:
                System.out.println("Yatırmak istediğiniz miktarı giriniz:");
                int miktar = inp.nextInt();
                bakiye += miktar;
                System.out.println("Hesabınızdaki güncel bakiye:" + bakiye + "TL");
                System.out.println("Esenlikler!");
                deneme = 0;
                break;

                case 2:
                System.out.println("Çekmek istediğiniz miktarı giriniz:");
                miktar = inp.nextInt();
                bakiye -= miktar;
                System.out.println("Hesabınızdaki güncel bakiye:" + bakiye + "TL");
                System.out.println("Esenlikler!");
                deneme = 0;
                break;

                case 3:
                System.out.println("Bakiyeniz:" + bakiye + "TL");
                System.out.println("Esenlikler!");
                deneme = 0;
                break;
                
                case 4:
                System.out.println("Çıkış yapılıyor!\nEsenlikler!");
                deneme = 0;
                }        
            }else {
                deneme --;
                System.out.println("Kullanıcı adı veya şifreniz yanlış tekrar deneyiniz!");
                if (deneme == 0){
                    System.out.println("Hesabınız bloke olmuştur!");
                }else{
                    System.out.println("Kalan hakkınız:" + deneme);
                }
            }
        }
    }
}
