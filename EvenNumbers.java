import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int sayac = 0;
        int ort = 0;
        int a = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 12 == 0) {
                sayac++;
                a +=i;
                ort = a/sayac;
            }
        }
        System.out.println(ort);
    }
}
