package Projects.Projects_01_Ok;

import java.util.Scanner;

public class countE_Ok {
    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı

     input: bucket
            b:1
        output 1 olmalı
        */

    //hint: .charAt, length(), for, index, counter,


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        // code start here
        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin

        int sayac = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                sayac++;
            }
        }
        System.out.println("Girdiginiz metinde b harfi " + sayac + " defa kullanilmistir");


    }
}
