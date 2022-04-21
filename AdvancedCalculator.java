import java.util.Scanner;

public class AdvancedCalculator {
    static void mod() {
        Scanner scan = new Scanner(System.in);
        int nr1, nr2;
        System.out.print("1.Sayı: ");
        nr1 = scan.nextInt();
        System.out.print("2.Sayı: ");
        nr2 = scan.nextInt();
        System.out.println("Sonuç: " + nr1 % nr2);
        scan.close();
    }

    static void area() {
        Scanner scan = new Scanner(System.in);
        int longSide, shortSide, area, around;
        System.out.print("Uzunkenarı giriniz: ");
        longSide = scan.nextInt();
        System.out.print("Kısakenarı giriniz: ");
        shortSide = scan.nextInt();
        if (shortSide <= 0 || longSide <= 0) {
            System.out.println("Kenarlar 0 a eşit ya da küçük olamaz...");
        } else {
            area = shortSide * longSide;
            around = 2 * (shortSide + longSide);
            System.out.println("Alan: " + area);
            System.out.println("Çevre: " + around);
        }
        scan.close();
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1;
        System.out.print("Sayıyı giriniz: ");
        number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        int base, exponent, result = 1;
        System.out.print("Taban değeri giriniz: ");
        base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        exponent = scan.nextInt();
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void divide() {
        Scanner scan = new Scanner(System.in);
        double nr1, nr2, result = 0;
        System.out.print("1.sayı:");
        nr1 = scan.nextInt();
        System.out.print("2.sayı:");
        nr2 = scan.nextInt();
        if (nr1 != 0 && nr2 == 0) {
            System.out.println("0 a bölemezsiniz...");

        } else {
            result = nr1 / nr2;
            System.out.println("Sonuç: " + result);
        }
        scan.close();
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, i = 1, result = 1;
        while (true) {
            System.out.print(i++ + ".sayı:");
            number = scan.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            if (number == 1) {
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        int counter, number, result = 0;
        System.out.print("Kaç sayı gireceksiniz: ");
        counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void add() {
        Scanner scan = new Scanner(System.in);
        int counter, number, result = 0, i = 1;
        System.out.print("Kaç sayı gireceksiniz : ");
        counter = scan.nextInt();
        for (int j = 1; j <= counter; j++) {
            System.out.print(i++ + ".sayı: ");
            number = scan.nextInt();
            result += number;
        }
        System.out.println("Sonuç: " + result);
        scan.close();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama/n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while(true){
            System.out.println();
            System.out.println(menu);
            System.out.println();
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select= scan.nextInt();
            if(select==0){
                break;
            }

            switch (select){
                case 1:
                    add();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
        scan.close();
    }
}
