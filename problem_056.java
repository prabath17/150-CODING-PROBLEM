
import java.util.*;

public class problem_056 {
    public static void main(String[] args) {
        int[] arr={6, 7, 1, 2, 8, 4, 5};
        Arrays.sort(arr);
        int min=arr[0];
        //int max=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=min){
                System.err.println(i+1);
                break;
            }
            min++;
        }
    }
    
}
