import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, total = 1;

        System.out.print("Taban değerini giriniz: ");
        n1 = scan.nextInt();
        System.out.print("Üst değerini giriniz: ");
        n2 = scan.nextInt();

        for (int i = 1; i <= n2; i++) {
            total *= n1;
        }
        System.out.println(total);
        scan.close();
    }
}
