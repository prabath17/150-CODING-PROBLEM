
import java.util.Arrays;

public class problem_069 {
    public static void main(String[] args) {
        int [] arr={10,20,10,30,14,40,60,10};
        int target=10;
        int count=0;
        for(int val:arr){
            if(target==val){
                count++;
            }
        }
        int [] res=new int[arr.length+count];
        int vount=1;
        int i=0;
        for (int val:arr){
            if(val==target){
                res[i++]=val;
                res[i++]=vount++;

            }
            else{
            res[i++]=val;
            }
        }
        System.err.println(Arrays.toString(res));
    }
    
}
