package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("IT alaninizi giriniz");
		String alan = scan.next();

		if (alan.equals("qa")) {
			System.out.println("Quality Analyst");
		}else if (alan.equals("dev")){
			System.out.println("Developer");
		}else if (alan.equals("ba")){
			System.out.println("Busines Analyst");
		}else if (alan.equals("pm")){
			System.out.println("Project Manager");
		}else {
			System.out.println("Lütfen gecerli bir IT alani giriniz");
		}


	}

}
