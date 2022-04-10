package _07_ForLoop;

public class Q16_Ok {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

        char input = 'F';

        for (char i = 'A'; i <= input; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println("");
        }


    }

}
