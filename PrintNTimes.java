import java.util.Scanner;

public class PrintNTimes {

    public static void print(int k, int l) {
        if (k > l) {
            return;
        }
        System.out.println("Khushal");
        print(k + 1, l);
    }

    public static void main(String[] args) {
        int l;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        print(1, l);
    }
}
