public class Asalsayi1_100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean Asal = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    Asal = false;
                    break;
                }
            }
            if (Asal) {
                System.out.println(i);
            }
        }
    }
}