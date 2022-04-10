package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y degerlerini giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(x>0 && y>0){
            System.out.println("1.bölge");
        }else if(x<0 && y>0){
            System.out.println("2.bölge");
        }else if (x<0 && y<0){
            System.out.println("3.bölge");
        }else if (x>0 && y<0){
            System.out.println("4.bölge");
        }else if (x!=0 && y==0){
            System.out.println("Degerler x ekseni üzerinde");
        }else if (x==0 && y!=0){
            System.out.println("Degerler y ekseni üzerindedir");
        }else System.out.println("Girdiginiz degerler orjin üzerindedir");


    }

}
