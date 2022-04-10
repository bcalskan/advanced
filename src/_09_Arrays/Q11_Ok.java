package _09_Arrays;

public class Q11_Ok {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int toplam1 = 0;
        int toplam2 = 0;
        int toplamGenel = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam1 += arr1[i][j];
            }
        }
        System.out.println("1. dizinin toplami : " + toplam1);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                toplam2 += arr2[i][j];
            }
        }
        System.out.println("2. dizinin toplami : " + toplam2);

        toplamGenel = toplam1 + toplam2;
        System.out.println("Iki dizinin toplami : " + toplamGenel);


    }

}
