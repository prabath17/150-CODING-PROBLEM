
import java.util.HashSet;

public class problem_123 {
    public static void main(String[] args) {
        String a="school";
        String b="cool";
        HashSet <Character> set=new HashSet<>();
        for(int i=0;i<a.length();i++){
            int count=0;
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    count++;
                }

            }
            if(count>=1){
                set.add(a.charAt(i));
            }
        }
        System.out.println(set);
    }
}
