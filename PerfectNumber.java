import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr, total = 0;
        System.out.print("Sayıyı giriniz: ");
        nr = scan.nextInt();
        for (int i = 1; i <nr; i++) {
            if (nr % i == 0) {
                total+=i;
            }
        }
        if(total==nr){
            System.out.println(nr+" mükemmel bir sayıdır.");
        }
        else{
            System.out.println(nr+" mükemmel bir sayı değildir.");
        }
        scan.close();
    }
}
