public class RecursiveFibonacci {
    static int fibo(int a) {
        if (a == 2) {
            return 1;
        }else if(a==1){
            return 0;
        }else{
            return fibo(a - 2) + fibo(a - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
