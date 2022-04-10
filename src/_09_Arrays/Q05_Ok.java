package _09_Arrays;

public class Q05_Ok {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        double input[] = {1, 2, 3, 4, 5, 6, 7};
        double ortalama = 0;
        double toplam = 0;

        for (int i = 0; i < input.length; i++) {
            toplam += input[i];
        }
        ortalama = toplam / input.length;
        System.out.println("Ortalama : " + ortalama);

        for (int j = 0; j < input.length; j++) {
            if (input[j] > ortalama) {
                System.out.print(input[j] + ", ");
            }
        }


    }

}


