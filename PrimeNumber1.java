import java.util.Scanner;
import java.util.SortedMap;

public class PrimeNumber1 {
    static boolean isPrimeNumber(int number) {
        boolean result = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();
        if (isPrimeNumber(number) == false) {
            System.out.println("ASAL");
        } else {
            System.out.println("ASAL DEĞİL");
        }
    }
}
