package meeting;

public class Q22 {
    public static void main(String[] args) {

        int futbolArr[] = {2, 1, 0, 0, 2, 1, 1, 2, 1, 0};
        /*
        2 --> 3 Puan
        1 --> 0 Puan
        0 --> 1 Puan
         */
        int gerekenPuan = 12;
        int puan = 0;

        for (int i = 0; i < futbolArr.length; i++) {
            if (futbolArr[i] == 2) {
                puan += 3;
            } else if (futbolArr[i] == 0) {
                puan += 1;
            } else System.out.println("0 Puan eklendi");
        }

        System.out.println("Toplanan puan : " + puan);

        if (puan == gerekenPuan) {
            System.out.println("Takim küme düsmedi.");
        } else System.out.println("Takim sizlere ömür.");


    }
}
