package Projects.Projects_02_Ok;

public class maxNumber_Ok {
    /*
        {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}
        int 2D arrayini  olustur
        2D arrayinden max number print et
    */
    public static void main(String[] args) {
     /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan
      */
        int[][] mdA = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};
        int max = mdA[0][0];

        for (int i = 0; i < mdA.length; i++) {
            for (int j = 0; j < mdA[i].length; j++) {

                if (mdA[i][j] > max) {
                    max = mdA[i][j];
                }
            }
        }
        System.out.println("Max deger : " + max);


    }

}
