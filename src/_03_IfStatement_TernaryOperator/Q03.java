package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu cm olarak giriniz : ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu kg olarak giriniz : ");
        double kilo = scanner.nextDouble();

        double bmi = kilo/((boy/100)*(boy/100));

        if (bmi<=20) {
            System.out.println("Oldukca zayifsiniz");
        }else if (bmi>20 && bmi<=25){
            System.out.println("Normal sinirlardasiniz ");
        }else if (bmi>25 && bmi<=30){
            System.out.println("Sisman kategorisindesiniz");
        }else if (bmi>30){
            System.out.println("Obez grubundasiniz");
        }else{
            System.out.println("Gecerli bir veri giriniz");
        }







    }

}
