
import java.util.Arrays;

class problem_087{
    public static void main(String[] args) {
        //int[] arr = {3, 1, 4, 2, 6, 10}; 
        int[] arr = {1, 2, 3, 4, 5};

        int i=0,j=arr.length-1;
        boolean flag=true;
        while(flag && i<j){
            int sum=0;
            int val=0;
            val=arr[i]+arr[j];
            for(int k=0;k<arr.length;k++){
                if(k==i|| k==j){
                    continue;
                }
                else{
                    sum+=arr[k];
                }
            }
            if (sum==val){
                int[] a={arr[i],arr[j]};
                int[] b=new int[arr.length-2];
                System.err.println(Arrays.toString(a));
                for(int m=0, n=0;m<arr.length;m++){
                    if(m==i|| m==j){
                        continue;
                    }
                    else{
                        b[n++]=arr[m];
                    }
                }
                System.err.println(Arrays.toString(b));
                flag=false;
                
            }
            else if(sum>val){
                i++;
            }
            else{
                j--;
            }
            
        
        
        

    }
    if (flag) {
        System.out.println("No such pair found.");
    }
}
}