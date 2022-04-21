import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c,u,alan;
        System.out.print("Üçgenin birinci kenarını giriniz: ");
        a = scan.nextDouble();
        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        b = scan.nextDouble();
        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        c = scan.nextDouble();
        u = (a+b+c)/2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı : " + alan + "metrekaredir");
        scan.close();
    }
}
