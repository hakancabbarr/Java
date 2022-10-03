import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String username, password, newPassword, a;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (username.equals("Hakan") && password.equals("Hakan112233")) {
            System.out.println("Giriş Yaptınız!");
        } else if (!username.equals("Hakan")) {
            System.out.println("Kullanıcı isminiz yanlış!");
        }

        else if (password != "Hakan 112233") {
            System.out.print("Bilgiler Yanlış!");
            System.out.println("(Sifre sıfırlamak için ilk e'ye, hemen ardından enter'a basınız)");
            a = inp.nextLine();
            if (a.equals("e") || a.equals("E")) {

                System.out.print("Yeni sifrenizi giriniz: ");
                newPassword = inp.nextLine();
                System.out.println("Şifre değiştirme işlemi başarılı!");

            } else {
                System.out.println("Şifre yenileme işlemi başarısız!!!");
            }

        }

    }
}
