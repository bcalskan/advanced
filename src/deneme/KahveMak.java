package deneme;

import java.util.Scanner;

public class KahveMak {
    static Scanner scan = new Scanner(System.in);
    static int numara;
    static int süt;
    static int boyut;

    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Kahve makinesine hos geldiniz.");
        System.out.println("=======================");

        System.out.println("Hangi kahveyi istersiniz?");
        String islemler = "1-Türk Kahvesi \n2-Filtre Kahve \n3-Espresso \n4-Americano \n5-Cikis";
        System.out.println(islemler);
        System.out.println("=======================");


        while (true) {

            System.out.println("Istediginiz kahvenin numarasini giriniz" + "\nCikis yapmak icin 5´e basiniz.");
            int numara = scan.nextInt();

            if (numara == 5) {
                System.out.println("Sistemden cikis yapiliyor...");
                break;
            } else if (numara == 4) {
                System.out.println("Americano hazirlaniyor...");
            } else if (numara == 3) {
                System.out.println("Espresso hazirlaniyor...");
            } else if (numara == 2) {
                System.out.println("Filtre kahve hazirlaniyor...");
            } else if (numara == 1) {
                System.out.println("Türk kahvesi hazirlaniyor...");
            } else {
                System.out.println("Hatali giris yapildi.");
                break;
            }


            System.out.println("Süt eklemek ister misiniz" + "\n1-Evet \n2-Hayir");
            int süt = scan.nextInt();

            if (süt == 1) {
                System.out.println("Süt ekleniyor...");
            } else if (süt == 2) {
                System.out.println("Sütsüz kahve hazirlaniyor...");
            } else if (süt == 5) {
                System.out.println("Sistemden cikis yapiliyor...");
                break;
            } else {
                System.out.println("Hatali giris yapildi");
                break;
            }

            System.out.println("Seker eklemek ister misiniz" + "\n1-Evet \n2-Hayir" + "\nCikis yapmak icin 5´e basiniz");
            int seker = scan.nextInt();

            if (seker == 1) {
                System.out.println("Kac seker eklemek istersiniz?");
                int sekerSayisi = scan.nextInt();
                System.out.println(sekerSayisi + " seker ekleniyor...");
            } else if (seker == 2) {
                System.out.println("Sekersiz kahve hazirlaniyor...");
            } else if (seker == 5) {
                System.out.println("Sistemden cikis yapiliyor...");
                break;
            } else {
                System.out.println("Hatali giris yapildi");
                break;
            }


            System.out.println("Hangi boy kahve istersiniz?" + "\n1-Giant boy \n2-Büyük boy \n3-Orta boy \n4-Kücük boy \nCikis yapmak icin 5´e basiniz");
            int boyut = scan.nextInt();

            if (boyut == 1) {
                System.out.println("Giant boy kahve hazirlaniyor...");
            } else if (boyut == 2) {
                System.out.println("Büyük boy kahve hazirlaniyor...");
            } else if (boyut == 3) {
                System.out.println("Orta boy kahve hazirlaniyor...");
            } else if (boyut == 4) {
                System.out.println("Kücük boy kahve hazirlaniyor...");
            } else if (boyut == 5) {
                System.out.println("Sistemden cikis yapiliyor...");
                break;
            } else {
                System.out.println("Hatali giris yapildi");
                break;
            }


        }

        System.out.println("Kahveniz hazirlandi!" + "\nAfiyet olsun!");


    }
}
