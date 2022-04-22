import java.util.Arrays;

public class RepeatCounter {
    static void frequency(int[] array1) {
        Arrays.sort(array1);
        System.out.println("Tekrar sayıları\n");
        for (int i = 0; i < array1.length; i++) {
            int counter = 1;
            for (int j = 0; j < array1.length; j++) {
                if ((array1[i] == array1[j]) && (i != j)) {
                    counter++;
                }
            }
            System.out.println(array1[i] + " sayısı " + counter + " kere tekrar edildi");
            i += counter - 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        frequency(arr);
    }
}
