import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = scan.nextInt();
        double total = 0;
        for (double i = 1; i <= number; i++) {
            total+=1/i;
        }
        System.out.println(total);
    }
}