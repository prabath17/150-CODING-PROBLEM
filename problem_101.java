import java.util.HashMap;

public class problem_101 {
    public static void main(String[] args) {
        String s="engineering";
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);
            freq.put(val, freq.getOrDefault(val, 0)+1);
        }
        int times=0;
        char val='0';
        for(char i:freq.keySet()){
            if(freq.get(i)>times){
                times=freq.get(i);
                val=i;
            }
            //System.out.print(i+""+freq.get(i));
        }
        System.out.println(val+" "+times);
    }
}
