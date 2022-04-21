import java.util.Scanner;

public class RecursiveExp {
    static int Exp(int base, int exp) {
        if (exp == 1) {
            return base;
        }
        if(exp==0){
            return 1;
        }
        return base * Exp(base,exp-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, exp;
        System.out.print("Taban değerini giriniz: ");
        base = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exp = scan.nextInt();
        System.out.println("Sonuç: " + Exp(base, exp));
    }
}
