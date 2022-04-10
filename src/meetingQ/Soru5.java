package meetingQ;

public class Soru5 {
    public static void main(String[] args) {

        //Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //        - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
        //        - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
        //        - Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.


        int input = 15;
        if (input > 100 || input < 0) {
            System.out.println("Hatali giris");

        } else {

            for (int i = 1; i <= input; i++) {
                if (i % 15 == 0) {
                    System.out.print("Java Güzeldir ");
                } else if (i % 5 == 0) {
                    System.out.print("Güzeldir ");
                } else if (i % 3 == 0) {
                    System.out.print("Java ");
                } else {
                    System.out.print(i + " ");
                }

            }
        }


    }
}
