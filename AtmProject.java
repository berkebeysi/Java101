import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int select, life = 3, balance = 3000;


        while (life > 0) {
            System.out.print("Kullanıcı Adı: ");
            userName = scan.nextLine();
            System.out.print("Şifre: ");
            password = scan.nextLine();

            if (userName.equals("berkebeysi") && password.equals("x5esmada")) {
                System.out.println("Tebrikler başarıyla giriş yaptınız.");
                do {
                    System.out.println();
                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = scan.nextInt();
                    switch(select){
                        case 1:
                            System.out.print("Yatırılacak para miktarını giriniz: ");
                            int price = scan.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarını giriniz: ");
                            int price2 = scan.nextInt();
                            if (price2 > balance) {
                                System.out.println("Yetersiz bakiye");
                            } else {
                                balance-=price2;
                                System.out.println("Bakiyeniz: " + balance);
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Çıkış yapıldı..");
                break;
            } else {
                life--;
                System.out.println("Hatalı kullanıcı adı veya şifre");
                if (life == 0) {
                    System.out.println("Hesabınız bloke edilmiştir.");
                } else {
                    System.out.println("Kalan hakkınız: " + life);
                }
            }
        }
        scan.close();
    }
}
