package _13_StringBuilder;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */

        String str = "I love Java";
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();

        System.out.println(str1);

        if (str.equals(str1)){
            System.out.println("Palindrome");
        }else System.out.println("Degil");

    }

}
