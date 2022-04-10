package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scan = new Scanner(System.in); //kullanicidan veri almak ---> scanner

		System.out.println("toplama icin 1 \ncikarma icin 2 \nbölme icin 3 \ncarpma icin 4");
		//kullaniciya secim icin islem menüsü yazdirdik

		int islem = scan.nextInt(); //kullanicinin islem tercihi icin variable create edilfi

		System.out.println("Lütfen iki tam sayi giriniz"); //kullaniciya bildirimde bulunuldu

		double num1 = scan.nextDouble(); //1.sayi assign edildi     //ctrl+d ayni satiri klonlar alta yapistirir
		double num2 = scan.nextDouble(); //2.sayi assign edildi		//alt´a basip farkli satirlardan islem yapabilirsin

		if (islem ==1){
			System.out.println("Toplama isleminin sonucu : " +num1+ " + "+num2+ " = " +(num1+num2));
		}else if (islem == 2){
			System.out.println("Cikarma isleminin sonucu : " +num1+ " - "+num2+ " = " +(num1-num2));
		}else if (islem == 3){
			System.out.println("Bölme isleminin sonucu : " +num1+ " / "+num2+ " = " +(num1/num2));
		}else if (islem == 4){
			System.out.println("Carpma isleminin sonucu : " +num1+ " * "+num2+ " = " +(num1*num2));
		}else {
			System.out.println("Hatali secim yaptiniz. Tekrar deneyiniz");
		}




	}

}
