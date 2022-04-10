package _06_Method_Creation;

import java.util.Scanner;

public class Q03_Ok {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Verileri saat, mil ve kg olarak giriniz");

        double saat = scan.nextDouble();
        double mil = scan.nextDouble();
        double kg = scan.nextDouble();

        cevir(saat, mil, kg);

    }

    private static void cevir(double saat, double mil, double kg) {

        double saniye = saat * 60;
        double kilometre = mil * 1.609344;
        double gram = kg * 1000;

        System.out.println(saat + " saat = " + saniye + " saniye");
        System.out.println(mil + " mil = " + kilometre + " kilometre");
        System.out.println(kg + " kg = " + gram + "gram");


    }


}






