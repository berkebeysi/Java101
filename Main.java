import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void function(int[] list, int number){
        Arrays.sort(list);
        int max=list[list.length-1],min=list[0];

        if(number <= list[0] || number >= list[list.length - 1]){
            System.out.println("Dizi aralığında giriniz");
        }
        else{
            for(int i : list){
                if(i<number){
                    min=i;
                }
            }

            for (int j = list.length - 1; j >= 0; j--) {
                if (list[j] > number) {
                    max = list[j];
                }
            }
            System.out.println(max);
            System.out.println(min);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println(Arrays.toString(list));
        System.out.print("Sayıyı giriniz: ");
        number = scan.nextInt();
        function(list,number);
        scan.close();
    }
}