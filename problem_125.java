import java.util.HashMap;

public class problem_125 {
    public static void main(String[] args) {
        String s="programming";
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);
            freq.put(val, freq.getOrDefault(val, 0)+1);
        }
        System.out.println("highest frequency :");
        for(char i:freq.keySet()){
            if(freq.get(i)>1){
               System.out.print(i+" ");
            }
            
        }
        System.out.println();
        System.out.println("lowest frequency :");
        for(char i:freq.keySet()){
            if(freq.get(i)<=1){
               System.out.print(i+" ");
            }
            
        }
        
    }
}
