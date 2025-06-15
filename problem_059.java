
import java.util.HashSet;

public class problem_059 {
    public static void main(String[] args) {
        
        int[] arr={1, 2, 2, 3, 4, 4, 5};
        HashSet <Integer> a=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        System.err.println(a);
    }
    
}
