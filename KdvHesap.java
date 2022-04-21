import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double para,kdvli,kdv = 0,kdvtutar;
        System.out.print("Tutarı giriniz: ");
        para = scan.nextDouble();

        if (para>=0 && para<=1000){
            kdv = 0.18;
        }
        else if(para>1000){
            kdv = 0.08;
        }
        kdvtutar = kdv * para;
        kdvli = para + kdvtutar;
        System.out.println("KDV'siz Fiyat: "+ para);
        System.out.println("KDV oranı: "+kdv);
        System.out.println("KDV'li Fiyat: "+ kdvli);
        System.out.println("KDV Tutarı: "+ kdvtutar);
    }
}
