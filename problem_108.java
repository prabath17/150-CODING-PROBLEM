
import java.util.HashMap;

public class problem_108 {
    public static void main(String[] args) {
        String s="aaabccccddaaaaab";
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);
            freq.put(val, freq.getOrDefault(val, 0)+1);
        }
        for(char i:freq.keySet()){
            System.out.print(i+""+freq.get(i));
        }
    }
}
