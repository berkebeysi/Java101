import java.util.Scanner;

public class Placement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scan.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        n3 = scan.nextInt();
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n3 + ">" + n2 + ">" + n1);
            } else {
                System.out.println(n2 + ">" + n3 + ">" + n1);
            }
        } else if (n2 < n3 && n2 < n1) {
            if (n3 < n1) {
                System.out.println(n1 + ">" + n3 + ">" + n2);
            } else {
                System.out.println(n3 + ">" + n1 + ">" + n2);
            }
        } else {
            if (n1 < n2)
                System.out.println(n2 + ">" + n1 + ">" + n3);
            else {
                System.out.println(n1 + ">" + n2 + ">" + n3);
            }
        }
        scan.close();
    }
}
