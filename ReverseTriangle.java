import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digitNumber;

        System.out.print("Basamak sayısını giriniz: ");
        digitNumber = scan.nextInt();
        System.out.println();
        for (int i = digitNumber; i >= 1; i--) {
            for (int k = digitNumber-i; k>=1; k--) {
                System.out.print(" ");
            }
            for (int j = (2 * i) - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
