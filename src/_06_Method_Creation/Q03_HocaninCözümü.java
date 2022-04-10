package _06_Method_Creation;

import java.util.Scanner;

public class Q03_HocaninCözümü {
    public static void main(String[] args) {
        //TASK :
        //        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        //        ceviren bir method yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Cevirmk istediginiz islemi giriniz : ");
        String islem = scan.next();
        System.out.print("Miktari giriniz : ");
        double miktar = scan.nextDouble();

        dönüstür(islem, miktar);

    }

    private static void dönüstür(String islem, double miktar) {

        switch (islem) {
            case "saat":
                System.out.println("Merak ettigin saat " + miktar * 60 * 60 + " saniyedir");
                break;
            case "mil":
                System.out.println("Merak ettigin mil " + miktar * 1.61 + " kilometredir");
                break;
            case "kg":
                System.out.println("Merak ettigin gram " + miktar * 1000 + " gramdir");
                break;

            default:
                System.out.println("Yanlis veri girdiniz");

        }


    }

}
