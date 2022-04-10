package constructorDeneme;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1 = new Araba();
        System.out.println(arb1.marka);
        arb1.yakit = "Dizel";
        arb1.elektrikliMi =false;
        System.out.println(arb1.maxHiz);

        System.out.println(arb1.toString()); //Model : null Yakit : Dizel Max hiz : 220 Mensei : Almanya




    }
}
