package meetingQ;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays12_2 {
    public static void main(String[] args) {

         /*
    N elemanli bir tamsayi dizisi veriliyor, diziyi sondan basa dogru ters cevirin
    input={1,3,3,7,4,10,6}
    output={6,10,4,7,3,3,1}
    =>ikinci yolu da temp kullanarak cozun
    ipucu=>bir temp olusturup son elemani ile indekse atma ve bunu length bitene kadar devam etme
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz : ");


        int n = scan.nextInt();
        int[] arr = new int[n]; //---> n elemanli bir array olusturuldu

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ". elemani giriniz : ");
            int eleman = scan.nextInt();
            arr[i] = eleman;
        }

        System.out.println("Arr : " + Arrays.toString(arr)); //Arr : [12, 20, 25, 48, 56, 55] ---> length 6

        int temp[] = new int[arr.length]; // arr uzunlugunda bir array olusturuldu

        for (int i = temp.length - 1; i >= 0; i--) {  // 5
            temp[i] = arr[temp.length - i - 1];
            // temp[5] = arr[6-5-1] --- arr[0]
        }
        System.out.println("Temp-Ters : " + Arrays.toString(temp)); //Temp-Ters : [55, 56, 48, 25, 20, 12]



    }
}
