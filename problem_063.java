import java.util.Arrays;
import java.util.HashMap;

public class problem_063 {
    public static void main(String[] args) {
        int[] arr={40,20,10,50,20,10,30,40};
        HashMap <Integer,Integer> freq =new HashMap<>();
        for (int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i], 0)+1);

        }
        int [] a=new int[freq.size()];
        int n=0;
        for(int i : freq.keySet()){
            a[n]=i;
            n++;
        }
        Arrays.sort(a);
        for (int key : a) {
            System.out.println("Key: " + key + " → Value: " + freq.get(key));
        }

    }
    
}
