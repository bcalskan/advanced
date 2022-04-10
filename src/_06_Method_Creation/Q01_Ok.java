package _06_Method_Creation;

import java.util.Scanner;

public class Q01_Ok {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat           OUTPUT :  gat
                         photo                    hoto
                         ghost                    ghost
                         kalem                    lem
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir giris yapiniz");
        String kelime = scan.next();

        System.out.println(ilkIkiKarakterHaricReturn(kelime));

    }
    private static String ilkIkiKarakterHaricReturn(String kelime) {
        String kalanHarfler = "";

        if (kelime.startsWith("gh")) { //ghost
            kalanHarfler = kelime;

        }else if (kelime.startsWith("g")){//goat
            kalanHarfler=kelime.charAt(0) + kelime.substring(2);//got

        }else if (kelime.charAt(1)=='h'){//photo
            kalanHarfler=kelime.substring(1);

        }else {
            kalanHarfler=kelime.substring(2);
        }
        return kalanHarfler;

    }



}

