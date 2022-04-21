import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = number - 1; x >= 1; x--) {
            for (int y = number - x; y >= 1; y--) {
                System.out.print(" ");
            }
            for (int z = (2 * x) - 1; z >= 1; z--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
