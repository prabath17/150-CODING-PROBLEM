
import java.util.Arrays;

public class problem_066 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int N=2;
        int[] arr=new int[a.length];
        int in=0;
        for(int i=N;i<a.length;i++){
            arr[in++]=a[i];
        }
        for(int i=0;i<N;i++){
            arr[in++]=a[i];
        }
        System.err.println(Arrays.toString(arr));
    }
}
