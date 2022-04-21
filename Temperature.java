import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp;

        System.out.print("Sıcaklık değerini giriniz: ");
        temp = scan.nextDouble();

        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz...");
        } else if (temp >= 5 && temp <= 25) {
            if (temp <= 15) {
                System.out.println("Sinemaya gidebilirsiniz...");
            }
            if (temp >= 10) {
                System.out.println("Piknik yapabilirsiniz...");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz...");
        }
    }
}