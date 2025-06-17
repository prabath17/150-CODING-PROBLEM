import java.util.Arrays;

public class problem_077 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int pos=2;
        int res[]=new int [arr.length-1];
        for(int i=0,j=0;i<arr.length;i++){
            if (i==pos-1){
                continue;
            }
            else{
                res[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
    
}
