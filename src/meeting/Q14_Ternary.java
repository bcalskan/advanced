package meeting;

import java.util.Scanner;

public class Q14_Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.

        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

        Eger aynı karakterlere sahipse
        "isim ayni karakterlere sahiptir." yazdirin.

        Eger ayni kaakterlere sahip degilse
        "Dizenin benzersiz karakterleri var" yazdirin.

        Ternary kullanin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim = scan.nextLine();

        System.out.println((isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) || isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var"
                : "isim uzunlugu 3´ten fazladir"));

    }
}
