import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = scan.nextInt();
        int temp = number, result = 0, basValue = 0, basPow , sayac = 0;

        while (temp != 0) {
            temp /= 10;
            sayac++;
        }
        temp = number;
        while (temp != 0) {
            basValue = temp % 10;
            basPow = 1;
            for (int i = 1; i <= sayac; i++) {
                basPow *= basValue;
            }
            result += basPow;
            temp /= 10;
        }
        if(result==number){
            System.out.println(number + " bir armstrong sayıdır.");
        }
        else{
            System.out.println(number + " bir armstrong sayı değildir");
        }
    }
}
