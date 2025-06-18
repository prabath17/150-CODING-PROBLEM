
import java.util.HashMap;

public class problem_089 {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 1, 3, 5, 1};
        int n=arr.length/2;
        HashMap <Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n+1;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }
        for(int i: freq.keySet()){
            if(freq.get(i)>1){
                System.out.println(i +" = "+freq.get(i));
            }
        }
    }
    
}
