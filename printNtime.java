import java.util.ArrayList;
import java.util.List;

public class printNtime{
    public static List<String> printNtimes(int n){
        List<String> result = new ArrayList<>();
       if (n <= 0) {
            return result;
        }

        result.add("Coding Ninjas "); // Add the string to the list
        result.addAll(printNtimes(n - 1)); // Recursively call the function to get the list of "Coding Ninjas"
        return result;
    }
    public static void main(String[] args) {
        List<String> l =printNtimes(4);
        System.out.println(l);// Printing the arraylist in a string format
    }   
}
