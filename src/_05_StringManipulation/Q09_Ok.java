package _05_StringManipulation;

import java.util.Scanner;

public class Q09_Ok {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String input = scan.nextLine();

        String ilkYarisi = input.substring(0, input.length() / 2);
        System.out.println(ilkYarisi);


    }
}
