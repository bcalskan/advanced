package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        int input = 6;

        for (int i = 1; i <= input; i++) {

            for (int j = i; j <= input; j++) {

                System.out.print(j + " ");
            }


            System.out.println("");

        }


    }
}


