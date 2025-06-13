public class problem_027 {
    public static void main(String[] args) {
        
        int n=361589;
        int count=0;
        int odd=0;
        int even=0;
        while(n>0){
            if((n%10)%2==0){
                even=even*10 +n%10;
                count++;
            }
            else{
                odd=odd*10 +n%10;
            }
            n/=10;
        }
        System.err.println(odd);
        System.err.println(even);
        System.err.println(count);
        System.err.println((odd*(int)Math.pow(10, count))+even);
    }
    
}
