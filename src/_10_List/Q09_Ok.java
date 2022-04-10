package _10_List;

import java.util.Arrays;
import java.util.Scanner;

public class Q09_Ok {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : "); //hayat java ile cok kolay
        String arr[] = scan.nextLine().split("");
        System.out.println(Arrays.toString(arr)); //[h, a, y, a, t,  , j, a, v, a,  , i, l, e,  , c, o, k,  , k, o, l, a, y]

        int maxSayac = 0; //en cok kullanilan karakterin sayisi
        int sayac = 0;
        String enCokTekrarEden = "";

        for (int i = 0; i < arr.length; i++) {  //karsilastirilan karakter kontorlü --->h
            for (int j = i + 1; j < arr.length; j++) { //karsilastiran karakter kontrolü --->a,y,a,t....
                if (arr[i].equalsIgnoreCase(arr[j])) { //esit karakterlerin kontrolü yapilip true durumunda sayac
                                                       // arttiriliarak esit karakterler saydirildi
                    sayac++;
                }
            }
            if (sayac > maxSayac) {
                maxSayac = sayac;
                enCokTekrarEden = arr[i];

            } else if (sayac == maxSayac) {
                enCokTekrarEden += ", " + arr[i];
            }
            sayac = 0;
        }//for

        System.out.println("Tekrar sayisi : " + (maxSayac + 1));
        System.out.println("En cok tekrar eden karakter : " + enCokTekrarEden);

    }
}

