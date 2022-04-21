import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("NOT ORTALAMA PROGRAMINA HOŞGELDİNİZ!!");
        double mat,fiz,kim,tr,tarih,muz,ort;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextDouble();;

        System.out.print("Fizik notunuzu giriniz: ");
        fiz= scan.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = scan.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        tr = scan.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = scan.nextDouble();

        ort = (mat + fiz + kim + tr + tarih + muz)/6 ;

        System.out.println("Ortalamanız: "+ ort);

        String durum = (ort>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
        scan.close();
    }
}