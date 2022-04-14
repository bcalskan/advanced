package yeniSorular;

public class Arrasy1_Ok {
    public static void main(String[] args) {
    /*
    Tam sayilardan olusan bir arrayimiz var. Bu arrayin ikili elemanlarinin (i,j) toplaminin
     verilen k elamanina  bolunebildigini kontrol eden bir kod yazin
    input=
    arr=[1,2,3,4,5,6]
    k=5;
    output= 3 adet ikili kritere uymaktadiroutput.  (bunlar [1,4],[2,3]ve [4,6])
     */


        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 5;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i] + arr[j]) % k == 0) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }

            }

        }

    }
}
