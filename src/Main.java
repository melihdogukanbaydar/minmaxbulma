import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, count, min = 0, max = 0;

        System.out.print("Kaç Sayı Gireceksiniz  : ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Sayı Giriniz : " + i);
            number = input.nextInt();
            if (i == 1) {
                min = number;
                max = number;

            } else if (number >= max) {
                max = number;

            } else if (number <= min) {
                min = number;

            }
            System.out.println("En Küçük Sayı : " + min);
            System.out.println("En Büyük Sayı : " + max);

        }
    }
}