package Projects.P05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

    /* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */

public class HalukMarket {
    static Scanner scan = new Scanner(System.in);
    static List<String> sepet = new ArrayList<>();
    static String ürün;
    static double kg;
    static Double[] arr2;
    static List<String> ürünListesi = new ArrayList<String>();
    static List<Double> fiyat = new ArrayList<Double>();
    static double tl = 0;
    static double tutarToplam = 0;
    static String devam;

    public static void main(String[] args) {
        ürünListele();

    }//main

    public static void ürünListele() {
        String[] arr = {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Üzüm", "Limon"};
        Double[] arr2 = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};
        ürünListesi = new ArrayList<String>(Arrays.asList(arr));
        fiyat = new ArrayList<Double>(Arrays.asList(arr2));

        System.out.println("Ürünler : " + ürünListesi);
        System.out.println("Fiyatlar : " + fiyat);


        sepeteEkle(ürün, kg);
    }

    public static void sepeteEkle(String ürün, double kg) {
        do {
            System.out.println("Satin almak istediginiz ürünün numarasini giriniz : ");
            ürün = scan.next();

            System.out.println("Kac kg satin almak istiyorsunuz : ");
            kg = scan.nextDouble();


            switch (ürün) {
                case "00":
                    tl += kg * fiyat.get(0);
                    tutarToplam += tl;
                    sepet.add(kg + " kg domates : " + tl + " TL");
                    break;
                case "01":
                    tl += kg * fiyat.get(1);
                    tutarToplam += tl;
                    sepet.add("Patates(kg) : " + tl + " TL");
                    break;
                case "02":
                    tl += kg * fiyat.get(2);
                    tutarToplam += tl;
                    sepet.add("Biber(kg) : " + tl + " TL");
                    break;
                case "03":
                    tl += kg * fiyat.get(3);
                    tutarToplam += tl;
                    sepet.add("Sogan(kg) : " + tl + " TL");
                    break;
                case "04":
                    tl += kg * fiyat.get(4);
                    tutarToplam += tl;
                    sepet.add("Havuc(kg) : " + tl + " TL");
                    break;
                case "05":
                    tl += kg * fiyat.get(5);
                    tutarToplam += tl;
                    sepet.add("Elma(kg) : " + tl + " TL");
                    break;
                case "06":
                    tl += kg * fiyat.get(6);
                    tutarToplam += tl;
                    sepet.add("Muz(kg) : " + tl + " TL");
                    break;
                case "07":
                    tl += kg * fiyat.get(7);
                    tutarToplam += tl;
                    sepet.add("Cilek(kg) : " + tl + " TL");
                    break;
                case "08":
                    tl += kg * fiyat.get(8);
                    tutarToplam += tl;
                    sepet.add("Kavun(kg) : " + tl + " TL");
                    break;
                case "09":
                    tl += kg * fiyat.get(9);
                    tutarToplam += tl;
                    sepet.add("Üzüm(kg) : " + tl + " TL");
                    break;
                case "10":
                    tl += kg * fiyat.get(10);
                    tutarToplam += tl;
                    sepet.add("Limon(kg) : " + tl + " TL");
                    break;
            }
            tutarToplam += tl;
            System.out.println("Sepet : " + sepet);
            System.out.println("Toplam ödemeniz :" + tutarToplam);

            System.out.println("Alisverise devam etmek icin E´ye \nKasaya gitmek icin K´ya basiniz : ");
            devam = scan.next().toUpperCase();

        } while (devam.equals("E"));


    }
}


