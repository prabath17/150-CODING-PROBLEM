import java.util.Arrays;

public class problem_058 {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 2, 8, 7, 4};
        int [] res=new int[arr.length];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0;
        int j=arr.length-1;
        int in=0;
        while(i<j){
            
            res[in++]=arr[i];
            
            res[in++]=arr[j];
            
            i++;
            j--;
            
        }
        if(i==j){
            res[in]=arr[i];
        }
        System.out.print(Arrays.toString(res));
    }
    
}
