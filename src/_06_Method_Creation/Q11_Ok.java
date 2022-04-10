package _06_Method_Creation;

import java.util.Scanner;

public class Q11_Ok {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4 ");

        secim();

    }

    private static void secim() {

        System.out.print("Yapacaginiz islemi secin : ");
        int secim = scan.nextInt();

        switch (secim) {

            case 1:
                bakiyeSorgulama();
                break;

            case 2:
                paraCek();
                break;

            case 3:
                paraYatir();
                break;

            case 4:
                cikis();
                break;
        }
    }

    private static void paraYatir() {
        System.out.print("Yatirmak istediginiz miktari giriniz :");
        int yatirilacakMiktar = scan.nextInt();
        bakiye += yatirilacakMiktar;
        System.out.println("Paraniz yatmistir");
        System.out.println("  ***  ");

        System.out.println("Isleme devam etmek istiyorsaniz 1\n istemiyorsaniz 0\n tuslayiniz ");

        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();
    }

    private static void paraCek() {
        System.out.print("Cekeceginiz miktari giriniz :");
        int miktar = scan.nextInt();

        if (miktar > bakiye) {
            System.out.println("Cekilmek istenen para miktari bakiyenizi asiyor.");
        } else {
            bakiye -= miktar;
            System.out.println("Islem basariyla gerceklesti");
        }
        System.out.println("  ***  ");

        System.out.println("Isleme devam etmek istiyorsaniz 1\n istemiyorsaniz 0\n tuslayiniz ");

        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();
    }
    
    private static void bakiyeSorgulama() {

        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("  ***  ");

        System.out.println("Isleme devam etmek istiyorsaniz 1\n istemiyorsaniz 0\n tuslayiniz ");

        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();

    }

    private static void cikis() {
        System.out.println("Yine bekleriz");
    }


}



