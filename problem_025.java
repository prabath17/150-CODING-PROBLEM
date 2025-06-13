public class problem_025 {
    public static void main(String[] args) {
        
        int val=0;
        int n=6928;
        while(n>9){
            val= Math.abs((n%100)/10 -n%10) + val*10;
            n/=10;
        }
        System.err.println(val);
        int result=0;
        while(val>0){
            result=result*10 + val%10;
            val/=10; 
            
        }
        System.err.println(result);
    }
    
}
