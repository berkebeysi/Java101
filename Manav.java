import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armut,elma,domat,muz,pat,total;
        double perArmut = 2.14;
        double perElma = 3.67;
        double perDomat = 1.11;
        double perMuz = 0.95;
        double perPat = 5;
        System.out.print("Armut kaç kilo? : ");
        armut = scan.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elma = scan.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        domat = scan.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        muz = scan.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        pat = scan.nextDouble();
        total = (armut * perArmut) + (elma * perElma) + (domat * perDomat) + (muz * perMuz) + (pat * perPat);
        System.out.println("Toplam Tutar: "+total+ " TL");
    }
}