package _07_ForLoop;

public class Q05_Ok {

    public static void main(String[] args) {
        /* TASK :
Aşağıdaki şekilde çıktı veren programı print içerisinde
sadece bir tane # kullanarak yazıdırınız
           #####
           #####
           #####
           #####
           #####
         */


        int input = 5;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print("#");
            }

            System.out.println("");

        }


    }
}
