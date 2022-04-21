import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.print("1.Sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        n2 = scan.nextInt();
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.print("Yapmak istediğiniz işlemin numarasını yazınız: ");
        n3 = scan.nextInt();

        switch(n3){
            case 1:
                n4=n1+n2;
                System.out.println("Sonuç: " + n4);
                break;
            case 2:
                n4=n1-n2;
                System.out.println("Sonuç: "+ n4);
                break;
            case 3:
                n4 = n1*n2;
                System.out.println("Sonuç: "+ n4);
                break;
            case 4:
                n4=n1/n2;
                System.out.println("Sonuç: "+n4);
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz...");
        }
        scan.close();
    }
}
