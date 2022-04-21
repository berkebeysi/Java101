import java.util.Scanner;

public class TotalOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0, n1 = 0;
        while (n1 >= 0 && n1 % 2 == 0) {
            if (n1 % 4 == 0) {
                total += n1;
            }
            System.out.print("Sayıyı giriniz: ");
            n1 = scan.nextInt();
        }
        System.out.println(total);
    }
}
