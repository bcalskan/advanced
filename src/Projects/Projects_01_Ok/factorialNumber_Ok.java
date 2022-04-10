package Projects.Projects_01_Ok;

import java.util.Scanner;

public class factorialNumber_Ok {

    public static void main(String[] args) {
        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.
        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720
         */

        Scanner dp = new Scanner(System.in);
        String strNum = dp.nextLine();
        int number = Integer.parseInt(strNum);

        //      code start here  use int number
        //      kodu burdan başlatın ve int number kullanın

        int faktoriyel = 1;
        for (int i = 1; i <= number; i++) {
            faktoriyel *= i;
        }
        System.out.println("Girdiginiz sayinin faktöriyeli : " + faktoriyel);

    }
}
