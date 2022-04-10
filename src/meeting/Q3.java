package meeting;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {


        /*
        Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.
        Input : 5
        Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int num = scan.nextInt(); //10

        int i = num + 1; // i =11
        int count = 0;
        while (count < 10) {
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    break;
                }
                if (j == 2) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            i++;
        }
    }
}
