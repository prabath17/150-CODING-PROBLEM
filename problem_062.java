
import java.util.HashMap;

public class problem_062 {
    public static void main(String[] args) {
        int[] arr={40,20,10,50,20,10,30,40};
        HashMap <Integer,Integer> freq =new HashMap<>();
        for (int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i], 0)+1);

        }
        System.err.println(freq);

    }
    
}
