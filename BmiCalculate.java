import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner indx = new Scanner(System.in);
        double height,weight,bmi;

        System.out.print("Lütfen boyunuzu metre cinsinde giriniz: ");
        height = indx.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = indx.nextDouble();

        bmi = weight/(height*height);
        System.out.println("Vücut Kitle İndeksiniz: "+ bmi);
    }
}