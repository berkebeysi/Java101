import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName,password;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = scan.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = scan.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Tebrikler başarılı bir şekilde giriş yaptınız: ");
        }
        else if(userName.equals("patika")){
            String a,b;
            System.out.println("Yanlış şifre girişi yaptınız...");
            System.out.print("Şifrenizi sıfırlamak ister misiniz?(evet ya da hayır yazınız): ");
            a = scan.nextLine();
            if(a.equals("evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                b = scan.nextLine();
                if(b.equals("java123")){
                    System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz...");
                }
                else{
                    System.out.println("Yeni şifreniz oluşturuldu tebrikler...");
                }
            }
            else if(a.equals("hayır")){
                System.out.println("Şifreniz yenilenmemiştir. İyi günler dileriz...");
            }
            else{
                System.out.println("Hatalı cevap verdiniz..");
            }
        }
        else{
            System.out.println("Kullanıcı adınız ve şifreniz hatalı");
        }
    }
}
