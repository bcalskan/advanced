package meetingQ;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

    //Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
    //0-1-1-2-3-5-8-13-21-34....

        Scanner scanner = new Scanner(System.in);
        System.out.print("47 den kucuk pozitif bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        fibonacci(sayi);
    }

    private static void fibonacci(int sayi) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " - ");
        System.out.print(n2);

        if (sayi < 47) {
            for (int i = 2; i < sayi; i++) {
                n3 = n1 + n2;
                System.out.print("- " + n3);
                n1 = n2;
                n2 = n3;

            }
        } else System.out.println("Hatali giris");
    }
}

