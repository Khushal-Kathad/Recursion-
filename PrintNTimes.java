public class PrintNTimes {

    public static void print(int k, int l) {
        if (k > l) {
            return;
        }
        System.out.println("Khushal");
        print(k + 1, l);
    }

    public static void main(String[] args) {
        print(1, 4);
    }
}
