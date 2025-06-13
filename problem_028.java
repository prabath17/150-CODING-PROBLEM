public class problem_028 {
    public static void main(String[] args) {
        int n=361589;
        int evencount=0;
        int oddcount=0;
        int odd=0;
        int even=0;
        while(n>0){
            if((n%10)%2==0){
                even=even*10 +n%10;
                evencount++;
            }
            else{
                odd=odd*10 +n%10;
                oddcount++;
            }
            n/=10;
        }
        System.err.println(odd);
        System.err.println(even);
        System.err.println(evencount);
        System.err.println(oddcount);
        System.err.println((odd*10+oddcount)*((int)Math.pow(10,evencount+1))+(even*10+evencount));
    }
    
}
