import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total, max = 0, min = 0, number;
        System.out.print("Kaç sayı gireceksiniz: ");
        total = scan.nextInt();
        for (int i = 1; i <= total; i++) {
            System.out.print("Sayıyı giriniz: ");
            number = scan.nextInt();
            if (number > max) {
                if (min == 0) {
                    min = number;
                }
                max = number;
            }
            if (number < min) {
                if (max == 0) {
                    max = number;
                }
                min = number;
            }
        }
        System.out.println("Maks: " + max);
        System.out.println("Min: " + min);
        scan.close();
    }
}
