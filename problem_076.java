import java.util.Arrays;

public class problem_076 {
    public static void main(String[] args) {
        int  po = 3, ele = 50;
        int arr[] = {10, 20, 30, 40};
        int res[] = new int[arr.length+1];
        
       
        for(int i=0,j=0;i<res.length;i++){
            if (i==(po-1)){
                res[po-1]=ele;
            }
            
            else{
                res[i]=arr[j++];
            }
            
        }
        System.out.println(Arrays.toString(res));
    }
}
