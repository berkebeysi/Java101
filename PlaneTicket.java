import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean status = true;
        int km, age, rt;
        double perKm = 0.10, cost;

        System.out.print("Uçmak istediğiniz mesafeyi kilometre cinsinden giriniz: ");
        km = scan.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = scan.nextInt();
        System.out.print("Yolculuk türünü seçiniz(1-Gidiş 2-Gidiş-Dönüş");
        rt = scan.nextInt();
        if (km <= 0 || age < 0 || (rt < 1 || rt > 2)) {
            status = false;
        }

        cost = perKm * km;

        if (age < 12) {
            cost -= cost * 0.5;
        } else if (age >= 12 && age <= 24) {
            cost -= cost * 0.10;
        } else if (age > 65) {
            cost -= cost * 0.3;
        }
        if (rt == 2) {
            cost = 2 * cost - 2 * cost * 0.2;
        }
        if (status) {
            System.out.println("Toplam Tutar: " + cost);
        } else {
            System.out.println("Hatalı veri girdiniz...");
        }
        scan.close();
    }
}
