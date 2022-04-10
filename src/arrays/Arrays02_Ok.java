package arrays;

public class Arrays02_Ok {
     /*
     bir sinifa ait ders notlari verilmis,basarili ogrencilerin not ortalamalarini bulunuz
     50 ve yukari not alan ogrenciler basarili sayilmaktadir
     input ={50,44,65,95,85,30,20,90,30}
   */

    public static void main(String[] args) {
        int[] input = {50, 44, 65, 95, 85, 30, 20, 90, 30};

        int sum = 0;
        double average = 0;
        int counter = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 50) {
                sum += input[i];
                counter++;
            }
        }

        average = sum / counter;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);


    }
}
