public class problem_026 {
    public static void main(String[] args) {
        
        int n=361589;
        int odd=0,even=0;
        while(n>0){
            if ((n%10)%2==0){
                even=even*10+(n%10);
            }
            else{
                odd=odd*10+(n%10);
            }
            n/=10;
        }
        System.out.print(even+odd);
    }
    
}
