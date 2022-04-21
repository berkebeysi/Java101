import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, facn = 1, facr = 1, facnr = 1, c;
        System.out.print("Kombinasyonları oluşturulacak sayıların ilkini giriniz: ");
        n = scan.nextInt();
        System.out.print("Kombinasyonları oluşturulacak sayıların ikincisini giriniz: ");
        r = scan.nextInt();
        if(n<=r){
            for (int i = 1; i <= n; i++) {
                facn *= i;
            }
            for (int j = 1; j <= r; j++) {
                facr *= j;
            }
            for (int k = 1; k <= n - r; k++) {
                facnr *= k;
            }
            c = facn / (facr * facnr);
            System.out.println("C(" + n + "," + r + ") = " + c);
        }
        else{
            System.out.println("Lütfen n sayısından küçük bir r giriniz");
        }
    }
}
