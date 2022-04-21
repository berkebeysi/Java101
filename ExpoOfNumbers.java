import java.util.Scanner;

public class ExpoOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        int n1 = scan.nextInt();

        System.out.println("**** 4'ün katları ****");
        for (int i = 1; i < n1; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("**** 5'in katları ****");
        for (int i = 1; i < n1; i *= 5) {
            System.out.print(i+",");
        }
        scan.close();
    }
}
