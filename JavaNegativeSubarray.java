import java.util.Scanner;

public class JavaNegativeSubarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int counter = 0, total = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
                if (total < 0) counter++;
            }
            arr[j] = 0;
        }
        scan.close();

        System.out.println(counter);
    }
}

