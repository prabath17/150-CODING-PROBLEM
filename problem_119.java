
import java.util.Arrays;

public class problem_119 {
    public static void main(String[] args) {
        String str= "Programming is fun";
        String[] arr=str.split(" ");
        int i=0,j=arr.length-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.err.println(Arrays.toString(arr));
    }
}
