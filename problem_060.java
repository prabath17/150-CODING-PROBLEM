
import java.util.*;

public class problem_060 {
    public static void main(String[] args) {
        HashMap <Integer,Integer> freq=new HashMap<>();
        int [] arr={4, 2, 2, 8, 5, 6, 8, 8};
        for(int i:arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);

        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        


        System.err.println(list);
        for (Map.Entry<Integer, Integer> entry : list) {
        System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    
}
