package meeting;

import java.util.Scanner;

public class Q11 {

    //Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.

    // Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

    //Ornek:
    //INPUT :
    //25
    //46
    //OUTPUT :
    //Numaralarin Toplami:
    //71


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tam sayi giriniz");

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();

        int basamakSayisi1 = 0;
        int basamakSayisi2 = 0;
        int basamakSayisiToplam = 0;

        int toplam = input1 + input2;


        if (input1 > 0 && input2 > 0) {
            System.out.println("Toplam : " + toplam);
        } else System.out.println("0´dan kücük");


        while (input1 > 0) {
            input1 /= 10;
            basamakSayisi1++;
        }
        System.out.println("Input1 basamaka sayisi : " + basamakSayisi1);

        while (input2 > 0) {
            input2 /= 10;
            basamakSayisi2++;
        }
        System.out.println("Input2 basamak sayisi : " + basamakSayisi2);


        while (toplam > 0) {
            toplam /= 10;
            basamakSayisiToplam++;
        }
        System.out.println("'Toplam' basamak sayisi : " + basamakSayisiToplam);


        if (basamakSayisi1 > 9 || basamakSayisi2 > 9 || basamakSayisiToplam > 9) {
            System.out.println("OverFlow");
        }


    }


}//main









