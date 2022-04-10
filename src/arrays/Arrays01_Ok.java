package arrays;

public class Arrays01_Ok {
    /*
        Bir sinifa ait ders notlari veriliyor
        Bu notlarin toplamini ve ortalamasini bulunuz
        input={30,56,56,75,95,100,30,80,50}
         */

    public static void main(String[] args) {

        int[] input = {30, 56, 56, 75, 95, 100, 30, 80, 50};

        int sum = 0;
        double average = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }

        average = sum / input.length;

        System.out.println("sum of elements : " + sum + "\nAverage of elements : " + average);


    }
}
