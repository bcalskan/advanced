package _07_ForLoop;

public class Q15_Ok {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {

        char harf = 'F';

        for (char i = 'A'; i <= harf; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");

        }

    }
}
