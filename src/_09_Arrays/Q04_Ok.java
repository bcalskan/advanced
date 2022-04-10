package _09_Arrays;

public class Q04_Ok {

    public static void main(String[] args) {
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */


        int arr[] = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenen = 9;

        esitle(arr, istenen);

    }

    private static void esitle(int[] arr, int istenen) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == istenen) {
                    System.out.println("Toplami istenene esit olan elementler " + arr[i] + " ve " + arr[j]);
                }


            }

        }
    }

}
