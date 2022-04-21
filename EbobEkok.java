import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr1, nr2, ebob = 0, ekok, temp = 0;

        System.out.print("1.Sayıyı giriniz: ");
        nr1 = scan.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        nr2 = scan.nextInt();

        while (temp <= nr1 && temp <= nr2) {
            temp++;
            if (nr1 % temp == 0 && nr2 % temp == 0) {
                ebob=temp;
            }
        }
        ekok = (nr1 * nr2) / ebob;
        System.out.println("Ekokları: " + ekok);
        System.out.println("Ebobları: " + ebob);
        scan.close();
    }
}
