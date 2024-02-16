public class SumOfFirstNNumbers {


    public static long sumFirstN(long n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumFirstN(n - 1);
        }      
    }

    public static void main(String[] args) {
        long l=sumFirstN(4);
        System.out.println("Sum of first 4 numbers is: "+l);
    }
}
