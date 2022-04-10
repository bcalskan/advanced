package _06_Method_Creation;

public class AsalCarpan {

    static int bolen = 0;
    static boolean isAsal = true;


    public static void main(String[] args) {

        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */

        int input = 65;

        asalCarpan(input);

    }

    private static void asalCarpan(int input) {

        int asalBölen = 0;

        for (int i = 2; i <= input; i++) {
            if (input % i == 0) {
                bolen = i;
                asalMi(bolen); //method call --> bölen sayinin asal olup ollmadigini kontrol eder
            }
            if (isAsal) {
                asalBölen = bolen;

            }

        }
        System.out.println("Girdiginiz sayinin en büyük asal böleni : " + asalBölen);


    }

    private static boolean asalMi(int bolen) {

        for (int i = 2; i < bolen; i++) {

            if (bolen % i == 0) { //bölen sayisini bölen sayisina kadar tüm tam sayilar böldügünde kalan 0 degilse; bu sayi kendisinden baska bir sayiya bölünmez demek
                isAsal = false;
                break;

            }

        }
        return isAsal;
    }
}
