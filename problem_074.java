import java.util.HashMap;

public class problem_074 {
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        HashMap <Integer,Integer> freq=new HashMap<>();
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        for(int i:freq.keySet()){
            if (freq.get(i)==1){
                System.out.println(i +" = "+freq.get(i));
            }
        }
    }
}
