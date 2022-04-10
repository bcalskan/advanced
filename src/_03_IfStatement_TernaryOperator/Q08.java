package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, azsa %15 indirim yapin
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Aldiginiz ürün adedini ve liste fiyatini giriniz");
		int adet = scan.nextInt();
		double listeFiyati = scan.nextDouble();
		double total = adet * listeFiyati;


		System.out.println("Müsteri kartiniz var mi?");
		String cevap = scan.next().toUpperCase();


		if(cevap.equals("VAR") && adet>=10){
			System.out.println(total-(total*0.20d));

		}else if (adet<10){
			System.out.println(total-(total*0.15d));
		}
		else if(cevap.equals("YOK") && adet>=10){
			System.out.println(total-(total*0.15d));
		}else if (adet<10){
			System.out.println(total-(total*0.10d));
		}


	}

}
