public class RepeatedEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 2, 4, 3, 4, 1, 6, 1, 6, 3, 1};
        int[] duplicate = new int[numbers.length];
        int startIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i != j) && (numbers[i] == numbers[j])) {
                    if (!isFind(duplicate, numbers[i])) {
                        duplicate[startIndex++] = numbers[i];
                    }
                    break;
                }
            }
        }
        for (int i : duplicate) {
            if ((i != 0) && (i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }
}
