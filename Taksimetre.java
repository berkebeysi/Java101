import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km,perKm = 2.20,tutar = 10;
        System.out.print("Gitmek istediğiniz mesafeyi kilometre cinsinden giriniz: ");
        km = scan.nextDouble();
        tutar += perKm * km;
        if(tutar>=20){
            System.out.println("Ödemeniz gereken tutar: "+ tutar);
        }
        else {
            System.out.println("Ödemeniz gereken tutar: "+ 20);
        }
    }
}