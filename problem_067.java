
import java.util.*;
public class problem_067 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            int pro=1;
            for(int j=0;j<arr.length;j++){
                if (arr[j]==val){
                    continue;
                }
                else{
                    pro*=arr[j];
                }
            }
            res[i]=pro;
        }
        System.err.println(Arrays.toString(res));
        //for(int val:res){
            //System.err.println(val);
        //}
    }
    
}
