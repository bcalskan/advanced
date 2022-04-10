package _14_Encapsulation.Q01;

public class ArabaMain {

    public static void main(String[] args) {

        Araba honda = new Araba();

        honda.setModel("Accord");
        honda.setYil(-2018);
        honda.setMotor(90);
        honda.setRenk("Kirmizi");

        Araba toyota = new Araba("Avensis", "Beyaz", 300, -2020); //parametreli
        Araba volvo = new Araba("S80", "Füme", 2400, 2010);
        Araba haciMurat = new Araba(1200, 1974);

        //toString methodu olmadan objeler referans degerini print eder.
        System.out.println("Honda ne ararsan var onda " + honda);
        System.out.println("Volvo  araci " + volvo);
        System.out.println("Sectiginiz arac Toyota --> " + " modeli : " + toyota.getModel() + " renk : " + toyota.getRenk() +
                " motor gücü : " + toyota.getMotor() + " yili : " + toyota.getYil());

    }
}
