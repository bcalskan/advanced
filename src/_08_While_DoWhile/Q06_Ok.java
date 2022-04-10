package _08_While_DoWhile;

import java.util.Scanner;

public class Q06_Ok {


    public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bölünen ve bölen degerleri giriniz");
        int bölünen = scan.nextInt();
        int bölen = scan.nextInt();
        int bölüm = 0;

        while (bölünen>bölen){
            bölüm++;
            bölünen = bölünen - bölen;
        }
        System.out.println(bölüm);


    }

}


