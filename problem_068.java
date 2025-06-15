import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem_068 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,2,5,6,1};
        HashMap <Integer,Integer> freq=new HashMap<>();
        for(int i:arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        /*int max=0;
        for(int val:freq.values()){
            if(val>max){
                max=val;
            }
        }*/
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println(list.get(0).getKey());

    }
    
}
