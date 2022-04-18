package Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    static List<KitapciDeposu> kitapListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapSayac;


    public static void main(String[] args) throws InterruptedException {

        anaMenu();
    }

    public static void anaMenu() throws InterruptedException {
        System.out.println("====================================\n\t " +
                "Q10 kITAP CENTER'A HOSGELDINIZ " +
                "\n\t====================================" +
                "\n============= İŞLEMLER =============\r\n     " +
                "1-KITAP EKLEME \r\n    " +
                "2-NUMARA ILE KITAP ARAMA\r\n     " +
                "3-BILGI ILE KITAP ARAMA \r\n     " +
                "4-NUMARA ILE SİLME\r\n     " +
                "5-KITAP LISTELEME\r\n     " +
                "6-CIKIS");
        System.out.println("Lutfen menuden bir islem seciniz");
        int tercih = 0;

        try {//try catch ile olasi int disinda girilecek variable onlenmeye calisildi
            tercih = scan.nextInt();
        } catch (Exception e) {
            String str = scan.next();
            System.out.println("Hatali giris yaptiniz. Lutfen bekleyiniz menuye yonlendirileceksiniz.");
            Thread.sleep(4000);//bekleme islemi yapilip, menu 4 saniye sonra gosterilecektir.
        }


        switch (tercih) {
            case 1:
                kitapEkle();
                anaMenu();
                break;
            case 2:
                numaraIleKitap();
                anaMenu();
                break;
            case 3:
                bilgiIleKitap();
                anaMenu();
                break;
            case 4:
                numaraIleSil();
                anaMenu();
                break;
            case 5:
                kitapListele();
                anaMenu();
                break;
            case 6:
                cikis();
                break;
            default:
                anaMenu();
        }

    }


    private static void cikis() {

        System.out.println("Bizi tercih ettiginiz tesekkur ederiz.");
    }

    private static void kitapListele() throws InterruptedException {//Ebru

        System.out.println("Sectiginiz kitaplarin bilgileri listelenecektir. Lutfen bekleyiniz.");
        Thread.sleep(4000);

        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.print("Kitap adi : " + kitapListesi.get(i).getKitapAdi() +
                    "Yazar adi : " + kitapListesi.get(i).getYazarAdi() +
                    "Kitap no : " + kitapListesi.get(i).getKitapNo() +
                    "Kitap fiyati :" + kitapListesi.get(i).getKitapFiyat());

        }
        System.out.println("Isleminiz basariyla gerceklesmistir. Menuye yonlendiriliyorsunuz, lutfen bekleyiniz.");
        Thread.sleep(4000);
    }

    private static void numaraIleSil() {//Mukiye H.
    }

    private static void bilgiIleKitap() throws InterruptedException {//Ebru-methdo adina yeniden BAK!

        System.out.println("Kitap adi ile aramak icin 1'e\t\nYazar adi ile aramak icin 2'ye" +
                "\t\nFiyat ile aramak icin 3'e basiniz");
        System.out.println("Menuye donmek icin 0'a\t\nCikmak icin 6'a basiniz.");
        int secim = scan.nextInt();

        switch (secim) {

            case 1: {
                System.out.println("Kitap adi giriniz :");
                scan.next();
                String kitapAdi = scan.nextLine();
                boolean varMi = true;
                int i = 0;

                while (varMi) {
                    if (kitapListesi.get(i).getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                        System.out.println("Isleminizin sonucunu asagidaki gibi gorebilirsiniz.");
                        System.out.print("Kitap adi : " + kitapListesi.get(i).getKitapAdi() +
                                "Yazar adi : " + kitapListesi.get(i).getYazarAdi() +
                                "Kitap no : " + kitapListesi.get(i).getKitapNo() +
                                "Kitap fiyati :" + kitapListesi.get(i).getKitapFiyat());
                        i++;
                    } else System.out.println("Kitap bulunamadi.");
                    break;
                }
            }

            while (true) {
                System.out.println("\nIsleminize devam etmek istiyorsaniz 1'e\nCikis yapmak icin 0'a basiniz");
                try {
                    secim = scan.nextInt();
                    if (secim == 1) {
                        numaraIleKitap();
                    } else if (secim == 0) {
                        anaMenu();
                    } else {
                        System.out.println("Lutfen gecerli bir islem giriniz");
                        bilgiIleKitap();
                    }

                } catch (Exception e) {
                    //e.printStackTrace();
                    String str = scan.next();
                }
            }


            case 2: {
                System.out.println("Yazar adi giriniz :");
                String yazarAdi = scan.nextLine();
                scan.next();
                boolean varMi = true;

                int i = 0;

                while (varMi) {

                    if (kitapListesi.get(i).getYazarAdi().equalsIgnoreCase(yazarAdi)) {
                        System.out.println("Isleminizin sonucunu asagidaki gibi gorebilirsiniz.");

                        System.out.print("Kitap adi : " + kitapListesi.get(i).getKitapAdi() +
                                "Yazar adi : " + kitapListesi.get(i).getYazarAdi() +
                                "Kitap no : " + kitapListesi.get(i).getKitapNo() +
                                "Kitap fiyati :" + kitapListesi.get(i).getKitapFiyat());

                        i++;
                    }else {
                        System.out.println("Yazar bulunamadi.");
                        break;
                    }
                }

            }


            while (true) {
                System.out.println("\nIsleminize devam etmek istiyorsaniz 1'e\nCikis yapmak icin 0'a basiniz");
                try {
                    secim = scan.nextInt();
                    if (secim == 1) {
                        numaraIleKitap();
                    } else if (secim == 0) {
                        anaMenu();
                    } else {
                        System.out.println("Lutfen gecerli bir islem giriniz");
                        bilgiIleKitap();
                    }

                } catch (Exception e) {
                    //e.printStackTrace();
                    String str = scan.next();
                }
            }


            case 3: {
                System.out.println("Kitap fiyati giriniz :");
                int kitapFiyati = scan.nextInt();
                boolean varMi = false;


                int i = 0;
                do {
                    if (kitapListesi.get(i).getKitapFiyat() == kitapFiyati) {
                        System.out.println("Isleminizin sonucunu asagidaki gibi gorebilirsiniz.");
                        System.out.print("Kitap adi : " + kitapListesi.get(i).getKitapAdi() +
                                "Yazar adi : " + kitapListesi.get(i).getYazarAdi() +
                                "Kitap no : " + kitapListesi.get(i).getKitapNo() +
                                "Kitap fiyati :" + kitapListesi.get(i).getKitapFiyat());
                    }
                    i++;
                } while (varMi == true);

                if (varMi) System.out.println("Fiyat bulunamadi.");
            }

            while (true) {
                System.out.println("Isleminize devam etmek istiyorsaniz 1'e\nCikis yapmak icin 0'a basiniz");
                try {
                    secim = scan.nextInt();
                    if (secim == 1) numaraIleKitap();
                    else if (secim == 0) anaMenu();
                } catch (Exception e) {
                    //e.printStackTrace();
                    String str = scan.next();
                    System.out.println("Lutfen gecerli bir islem giriniz");
                }
            }
            case 0:
                anaMenu();
                break;
            case 6:
                cikis();
                break;
            default: {
                System.out.println("Hatali giris yaptiniz. ");
                bilgiIleKitap();
                break;

            }
        }
    }


    private static void kitapEkle() throws InterruptedException {//Serkan B.

        System.out.print("kitap adi :");
        scan.nextLine();// dummy art arda olan scanlarde ilk sout altina
        String kitapAdi = scan.nextLine();
        System.out.print("yazar adi :");
        String yazarAdi = scan.nextLine();
        System.out.print("fiyat :");
        int kitapFiyat = scan.nextInt();
        int kitapNo = 1000 + kitapSayac;


        kitapSayac++;
        KitapciDeposu yeniKitap = new KitapciDeposu(kitapAdi, kitapNo, yazarAdi, kitapFiyat);
        kitapListesi.add(yeniKitap);
        System.out.print("eklemeye devam icin 1'e bas , Ana menu icin 0'a bas..: ");
        int tercih = 0;
        tercih = scan.nextInt();
        if (tercih == 1) {
            kitapEkle();
        } else if (tercih == 0) {
            anaMenu();
        } else {
            System.out.println("hatali giris..");
        }

    }

    private static void numaraIleKitap() {//Nail B.
    }
}
