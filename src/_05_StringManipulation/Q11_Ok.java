package _05_StringManipulation;

public class Q11_Ok {
    public static void main(String[] args) {

        /*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        //  String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //
        //        char a = pickName.charAt(pickName.indexOf("A")); //A
        //        char l = pickName.charAt(pickName.indexOf("L")); //L
        //        char i = pickName.charAt(pickName.indexOf("i")); //i
        //
        //        System.out.println(""+a+l+i);

        String  harfDeposu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char a=harfDeposu.charAt(harfDeposu.indexOf("A"));//A
        char l=harfDeposu.charAt(harfDeposu.indexOf("L"));//L
        char i=harfDeposu.charAt(harfDeposu.indexOf("I"));//I

        System.out.println("" +a+l+i);
    }

}
