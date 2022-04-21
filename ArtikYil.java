import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;

        System.out.print("Bir yıl giriniz: ");
        year = scan.nextInt();
        if(year%4==0){
            System.out.println(year+ " bir artık yıldır");
        }
        else{
            System.out.println(year + " bir artık yıl değildir");
        }
    }
}
