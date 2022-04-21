public class Harmonic {
    static double harmonic(int[] arr){
        double total=0;
        for (int i = 0; i < arr.length; i++) {
            total += 1.0 / arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] list = {1, 23, 421, 241, 23, 412, 21, 323, 142};
        System.out.println(list.length/harmonic(list));
    }
}