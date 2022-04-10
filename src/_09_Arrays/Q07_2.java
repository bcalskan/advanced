package _09_Arrays;

public class Q07_2 {
    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 8
         */
        int[][] arr = {{-1, -2, -3}, {-41, -55}, {-61, -17, -80, -90}};
        //int max = arr[0][1];
        int max = Integer.MIN_VALUE;

        maksimumBul(arr, max);
    }

    private static void maksimumBul(int[][] arr, int max) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max + " maksimum degerdir");
    }
}
