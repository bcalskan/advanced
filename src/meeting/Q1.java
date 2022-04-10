package meeting;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

           /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        1 şeker = 1.7 gr
        Örnek Çıktı:
        Yılda 12.41 kg şeker kullanıyor.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Gunde kac bardak cay iciyorsun : ");
        int cay = scan.nextInt();
        System.out.print("Gunde ne kadar seker kullaniyorsun : ");
        int seker = scan.nextInt();
        System.out.println("Yilda " + (((seker * 1.7) * cay) / 1000) * 365 + " kg seker kullaniyor");
    }
}

