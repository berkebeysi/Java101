public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        c = a + b;
        System.out.println(0);
        System.out.println(1);
        System.out.println(1);
        for (int i = 0; i <= 10; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
    }
}
