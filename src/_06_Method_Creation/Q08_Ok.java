package _06_Method_Creation;

import java.util.Scanner;

public class Q08_Ok {
    public static void main(String[] args) {
         /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return typeli reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scanner.nextLine();

        reverseWord(metin);

    }

    private static String reverseWord(String metin) {
        String ters = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            ters += metin.charAt(i);
        }
        System.out.println("Tersten : " + ters);

        return metin;
    }


}
