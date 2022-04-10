package _03_IfStatement_TernaryOperator;

public class Q10_ornek {
    public static void main(String[] args) {
        boolean x = true;

        int a = (x ? 5 : 30);
        System.out.println(a);

        String s = (x ? "test" : "654");
        System.out.println(s);

        if(x) s = "test";
        else s = "654";
        System.out.println(s);

        a = 3;s = "5";char c = 'x';a = 6;

        if(x) {s ="test";}else{s="55";}


    }
}
