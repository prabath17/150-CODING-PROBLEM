
import java.util.Arrays;

public class problem_106 {
    public static void main(String[] args) {
        String s="chennaicity";
        String goal="odd";
        int i,j;
        if(goal.equals("odd")){
             i=1;
             j=s.length()-2;
        }
        else{
             i=0;
             j=s.length()-1;
        }
        char[] chars = s.toCharArray();
        while(i<j){
            

        // Swap logic
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        i+=2;
        j-=2;
        }
        //Output:ctecnainihy
        System.out.println(Arrays.toString(chars));
    }
}
