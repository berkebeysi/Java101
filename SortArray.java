import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayLength;
        System.out.print("Dizinin boyutu n : ");
        arrayLength = scan.nextInt();

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + ". elemanı : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralama : " + Arrays.toString(arr));
        scan.close();
    }
}
