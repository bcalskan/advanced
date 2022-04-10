package _06_Method_Creation;

import java.util.Scanner;

public class Q04_Ok {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String input = scan.nextLine();

        trueFalse(input);
    }
    private static boolean trueFalse(String input) {
        boolean xyz = true;

        if (input.contains("xyz")) {
            System.out.println(xyz);
        } else {
            System.out.println(!xyz);
        }
        return xyz;

    }
}
