import java.util.Scanner;

public class PalindromNumbers {
    static boolean isPalindrom(int a) {
        int basamak, total = 0, sayac = 0, temp = a, temps;
        while (temp != 0) {
            temp /= 10;
            sayac++;
        }
        temp = a;
        temps = sayac;
        for (int i = 1; i <= sayac; i++) {
            basamak = temp % 10;
            int basDeg = 1;
            for (int j = temps; j > 1; j--) {
                basDeg *= 10;
            }
            total += (basamak * basDeg);
            temps--;
            temp /= 10;
        }

        if (total == a)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(1331));
    }
}
