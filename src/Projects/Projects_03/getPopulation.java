package Projects.Projects_03;

import java.util.Scanner;

public class getPopulation {
    /*
    Method adı populationOfCountry
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (str) alacak

     countryNames Ülke isimleri

     countryPopulations Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

      countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali


     */
    public static void main(String[] args) {

        String[] ülkeIsimleri = {"Türkiye","Almanya","Hollanda"};
        int[] ülkeNüfuslari = {95,83,17};

        Scanner scan = new Scanner(System.in);
        System.out.println("Nüfusunu ögrenmek istediginiz ülke : ");
        String ülke = scan.nextLine().toLowerCase();

        switch (ülke){
            case "Türkiye" :
            case "türkiye" :
                System.out.println(ülkeNüfuslari[0]);
                break;

            case "Almanya" :
            case "almanya" :
                System.out.println(ülkeNüfuslari[1]);
                break;

            case "Hollanda" :
            case "hollanda" :
                System.out.println(ülkeNüfuslari[2]);
                break;
        }

    }
}
