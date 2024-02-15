import java.util.Scanner;

public class Print1ToNTimes {

    public static void print(int t,int n){
        if (t>n) {
            return;
        }
        System.out.println(t);
        print(t+1, n);
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        print(1, n);

    }
}
