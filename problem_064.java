import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem_064 {
    public static void main(String[] args) {
        
        int[] arr={40,20,10,50,20,10,30,40};
        HashMap <Integer,Integer> freq =new HashMap<>();
        for (int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i], 0)+1);

        }
         List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
         list.sort(Map.Entry.comparingByValue());

         for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println("Key: " + entry.getKey() + " → Value: " + entry.getValue());
        }
    }
    
}
