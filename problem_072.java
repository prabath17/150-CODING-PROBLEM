import java.util.Arrays;

public class problem_072{
    public static void main(String[] args){
        int [] arr={1,2,3,9};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}