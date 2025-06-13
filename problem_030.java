public class problem_030 {
    public static void main(String[] args) {
        int n=53467;
        int evencount=0;
        int oddcount=0;
        
        while(n>0){
            if((n%10)%2==0){
                
                evencount++;
            }
            else{
               
                oddcount++;
            }
            n/=10;
        }
        System.out.println("EVEN COUNT ="+evencount);
        System.out.println("ODD COUNT ="+oddcount);
    }
    
}
