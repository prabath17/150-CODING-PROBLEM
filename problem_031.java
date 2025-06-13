public class problem_031 {
    public static void main(String[] args) {
        
        int n=45672;
        boolean flag=true;
        while(n>9){
            if ((n%100)/10 <= (n%10)){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            n/=10;
        }
        System.err.println(flag);
    }
    
}
