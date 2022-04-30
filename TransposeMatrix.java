import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matrisin boyutlarını sırasıyla giriniz");
        System.out.print("Satır: ");
        int row = scan.nextInt();
        System.out.print("Sütun: ");
        int col = scan.nextInt();
        int[][] original = new int[row][col];
        int[][] transpose = new int[original[0].length][original.length];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((i+1) + ".satırın " + (j+1) + ".değeri: ");
                original[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        for (int x = 0; x < original.length; x++) {
            for (int j = 0; j < original[0].length; j++) {
                transpose[j][x] = original[x][j];
            }
        }
        System.out.println("Original Matrix: \n");
        for (int[] i : original) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose Matrix: \n");
        for (int[] i : transpose) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
