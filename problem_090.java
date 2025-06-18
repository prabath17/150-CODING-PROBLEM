import java.util.Arrays;

public class problem_090 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5};
        int n = arr.length;
        int k = 2;
        int[] res = new int[n];
        
        int i = 0; // index for result array
        int j = 0; // index for input array
        
        while (i < n && j < arr.length) {
            res[i++] = arr[j];
            if (arr[j] == k && i < n) {
                res[i++] = k; // duplicate k
            }
            j++;
        }
        
        System.out.println(Arrays.toString(res));
    }
}
