import java.util.Scanner;

public class GreatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reset = 0;
        do {
            int number = 0;
            int mod = 0;
            int add = 0;

            System.out.print("Bir Sayı Giriniz: ");
            number = scanner.nextInt();
            for (int i = 1; i < number; i++) {
                mod = number % i;
                if (mod == 0) {
                    add += i;
                }
            }

            if (add == number) {
                System.out.println(number + " Bir Mükemmel Sayıdır!");
            } else {
                System.out.println(number + " Bir Mükemmel Sayı Değildir!");
            }
            System.out.print("Çıkış Yapmak İçin 0'a Basınız:\n" +
                    "Yeniden Denemek İçin Rastgele Bir Rakama Basınız: ");
            reset = scanner.nextInt();
        }while(reset != 0);
    }
}
