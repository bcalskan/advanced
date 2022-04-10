package Projects.Projects_02_Ok;

public class sumTotal_Ok {
    /*
       String 2D array oluştur
       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
       String de $ varsa 3.2 ile çarp
       String de € varsa 4.2 ile çarp
       double return et
    */
    public static void main(String[] args) {

//        Koda burdan başlayın

        String[][] mdA = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};
        double toplam$ = 0;
        double toplam€ = 0;


        for (int i = 0; i < mdA.length; i++) {
            for (int j = 0; j < mdA[i].length; j++) {

                if (mdA[i][j].contains("$")) {
                    toplam$ += Integer.valueOf(mdA[i][j].replace("$", ""));
                } else if (mdA[i][j].contains("€")) {
                    toplam€ += Integer.valueOf(mdA[i][j].replace("€", ""));
                }

            }
        }

        System.out.println("$ Toplami : " + toplam$ + "$");
        System.out.println("€ Toplami : " + toplam€ + "€");

    }
}



