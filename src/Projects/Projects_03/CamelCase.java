package Projects.Projects_03;

public class CamelCase {
    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
    public static void main(String[] args) {

        String input = "bu keLiMeLerin ilk haRflerIni büYük harfe cevir";
        camelCase(input);


    }

    private static void camelCase(String input) {
        String arr[] = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase()+" ");
        }


    }
}
