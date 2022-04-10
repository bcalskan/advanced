package Projects.P04;

import java.util.Scanner;

public class OkulYönetimi {

//    ----------Öğrenci Not Sistemi-----------
//            ----------Course Class Özellikleri :
//    fields (variable) : name,code,prefix,note,Teacher
//    Methods : Course() , addTeacher() , printTeacher()
//----------Teacher Class Özellikleri :
//    fields : name,mpno,branch
//    Methods : Teacher()
//----------Student Class Özellikleri :
//    fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
//    Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
//
//-----------TASK
//    Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
//    her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
//    yüzdesi ile dahil edin.
//
//    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
//    sınav notunun etkisi %80'dir.
//
//    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin
//    genel ortalamaya etkisi şu şekilde hesaplanır :
//
//    Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen not girmek istediginiz dersi seciniz.\nFizik icin F´ye, Matematik icin M'ye, Tarih icin T'ye, Kimya icin K'ya basiniz.");
        String ders = scan.next();

        System.out.print("Lütfen sözlü notunuzu giriniz : ");
        double sözlü = scan.nextDouble();

        System.out.print("Lütfen yazili notunuzu giriniz : ");
        double yazili = scan.nextDouble();

        double dersOrtalamasi = 0;


        switch (ders) {
            case "F":
                dersOrtalamasi = (sözlü * 0.20) + (yazili * 0.80);
                System.out.println("Fizik dersi ortalamaniz : " + dersOrtalamasi);
                break;
            case "M":
                dersOrtalamasi = (sözlü * 0.40) + (yazili * 0.60);
                System.out.println("Matematik dersi ortalamaniz : " + dersOrtalamasi);
                break;
            case "T":
                dersOrtalamasi = (sözlü * 0.50) + (yazili * 0.50);
                System.out.println("Tarih dersi ortalamaniz : " + dersOrtalamasi);
                break;
            case "K":
                dersOrtalamasi = (sözlü * 0.15) + (yazili * 0.85);
                System.out.println("Kimya dersi ortalamaniz : " + dersOrtalamasi);
                break;


        }
    }


}
