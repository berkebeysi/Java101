import java.util.Scanner;

public class RecursivePattern
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a num: ");
        num = input.nextInt();

        pattern(num);
    }

    static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }

        System.out.print(num + " ");
        pattern(num - 5);
        System.out.print(num + " ");
    }

}