import java.util.Scanner;

public class GradePassProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, tr, fiz, kim, muz, ort, dersSayisi = 0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        dersSayisi = (mat < 0 || mat > 100) ? dersSayisi : ++dersSayisi;
        mat = (mat < 0 || mat > 100) ? 0 : mat;

        System.out.print("Türkçe notunuzu giriniz: ");
        tr = scan.nextInt();
        dersSayisi = (tr < 0 || tr > 100) ? dersSayisi : ++dersSayisi;
        tr = (tr < 0 || tr > 100) ? 0 : tr;

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = scan.nextInt();
        dersSayisi = (fiz < 0 || fiz > 100) ? dersSayisi : ++dersSayisi;
        fiz = (fiz < 0 || fiz > 100) ? 0 : fiz;

        System.out.print("Kimya notunuzu giriniz: ");
        kim = scan.nextInt();
        dersSayisi = (kim < 0 || kim > 100) ? dersSayisi : ++dersSayisi;
        kim = (kim < 0 || kim > 100) ? 0 : kim;

        System.out.print("Müzik notunuzu giriniz: ");
        muz = scan.nextInt();
        dersSayisi = (muz < 0 || muz > 100) ? dersSayisi : ++dersSayisi;
        muz = (muz < 0 || muz > 100) ? 0 : muz;

        ort = (mat + tr + fiz + kim + muz) / dersSayisi;
        if (ort >= 55) {
            System.out.println("Tebrikler geçtiniz...");
        } else {
            System.out.println("Kaldınız...");
        }
        System.out.println("Ortalamanız: " + ort);
    }
}