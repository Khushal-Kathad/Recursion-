public class PrintNTO1BT {

        static void print(int l,int k){
            if (l>=k) {
                return;
            }else{
                print(l+1, k);
                System.out.println(l);
            }
        }
        public static void main(String[] args) {
            print(1, 4);
        }
}
