package MineField;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static int rowNumber;
    static int colNumber;

    MineSweeper(int rowNumber, int colNumber) {
        MineSweeper.rowNumber = rowNumber;
        MineSweeper.colNumber = colNumber;
    }

    public static void run() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[][] mines = new String[rowNumber][colNumber];
        String[][] Field = new String[rowNumber][colNumber];
        int bombNumber = (colNumber * rowNumber) / 4;
        int rowGuess, colGuess, playTime = rowNumber * colNumber - bombNumber, situation = 0;

        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[0].length; j++) {
                mines[i][j] = "- ";
                Field[i][j] = "- ";
            }
        }

        for (int i = 0; i < bombNumber; i++) {
            int x = rand.nextInt(0, rowNumber);
            int y = rand.nextInt(0, colNumber);
            mines[x][y] = "* ";
        }
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[0].length; j++) {
                System.out.print(mines[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMayın Tarlası Oyununa Hoşgeldiniz...");
        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[0].length; j++) {
                System.out.print(Field[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        while (playTime > 0) {
            System.out.print("Satırı giriniz: ");
            rowGuess = scan.nextInt();
            System.out.print("Sütunu giriniz: ");
            colGuess = scan.nextInt();
            System.out.println("================");

            if (rowGuess >= rowNumber || colGuess >= colNumber || rowGuess < 0 || colGuess < 0) {
                System.out.println("Lütfen aralıkta sayılar giriniz!");
            } else {
                situation = MineSweeper.detect(rowGuess, colGuess, mines, Field);
                if (situation == 1) {
                    System.out.println("Game Over!!!");
                    break;
                }
                for (int i = 0; i < mines.length; i++) {
                    for (int j = 0; j < mines[0].length; j++) {
                        System.out.print(Field[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();

                playTime--;
            }
        }
        if (situation == 0) {

            System.out.println("Kazandın!");
        }
        scan.close();
    }

    static int detect(int rowGuess, int colGuess, String[][] mines, String[][] Field) {
        int counter = 0;
        for (int a = 0; a < mines.length; a++) {
            for (int b = 0; b < mines[0].length; b++) {
                if (mines[a][b] == "* ") {
                    if (rowGuess == a && colGuess == b) return 1;
                    else if (rowGuess - 1 == a && colGuess == b) counter++;
                    else if (rowGuess == a && colGuess == b + 1) counter++;
                    else if (rowGuess == a && colGuess == b - 1) counter++;
                    else if (rowGuess + 1 == a && colGuess == b) counter++;
                    else if (rowGuess - 1 == a && colGuess - 1 == b) counter++;
                    else if (rowGuess + 1 == a && colGuess - 1 == b) counter++;
                    else if (rowGuess - 1 == a && colGuess + 1 == b) counter++;
                    else if (rowGuess + 1 == a && colGuess + 1 == b) counter++;
                }
            }
        }
        if (counter > 0) Field[rowGuess][colGuess] = String.valueOf(counter + " ");
        else Field[rowGuess][colGuess] = String.valueOf(0 + " ");
        return 0;
    }
}

