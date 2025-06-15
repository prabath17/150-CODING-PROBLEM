
import java.util.Arrays;



public class problem_061 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 25, 35, 45 }; 
        int d=2;
        //Arrays.sort(a);
        int i=0;
        int j=d;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        int n=d+1;
        int m=a.length-1;
        while(n<m){
            int temp=a[n];
            a[n]=a[m];
            a[m]=temp;
            n++;
            m--;
        }
        System.err.println(Arrays.toString(a));

    }
    
}
