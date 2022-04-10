package Projects.Projects_02_Ok;

public class minNumber_Ok {
    /*
        {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
        int 2D arrayini  olustur
        2D arrayinden min number print et
    */
    public static void main(String[] args) {
          /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan
          */

        int[][] mdA = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int min = mdA[0][2];

        for (int i = 0; i < mdA.length; i++) {
            for (int j = 0; j < mdA[i].length; j++) {
                if (mdA[i][j] < min) {
                    min = mdA[i][j];
                }
            }
        }
        System.out.println("Min deger : " + min);

    }

}
