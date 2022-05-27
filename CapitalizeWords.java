import java.util.Scanner;

public class CapitalizeWords {
    public static String capitalize(String str) {
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ') {
                str = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cümleyi giriniz: ");
        String a = scan.nextLine();
        System.out.println(capitalize(a));
        scan.close();
    }
}

