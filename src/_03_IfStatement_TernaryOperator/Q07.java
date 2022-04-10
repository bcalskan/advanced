package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		char a =scan.next().charAt(0);

		if (a>='A' && a<='Z'){
			System.out.println("Büyük Harf");
		}else if (a>='a' && a<='z'){
			System.out.println("Kücük Harf");
		}else {
			System.out.println("Hatali giris yaptiniz");
		}





	}

}
