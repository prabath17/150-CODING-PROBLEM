public class problem_029 {
    public static void main(String[] args) {
        int n=143;
        int result=0;
        while(n>0){
            int rem =n%10;
            result=result*10 + rem;
            n/=10;

        }
        System.out.println(result);
    }
    
}
