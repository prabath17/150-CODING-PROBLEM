public class problem_049 {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=i;j++){
                if (j%2==0){
                    System.err.print("0");
                }
                else{
                    System.err.print("1");
                }
            }
            System.err.println("");
        }
    }
    
}
