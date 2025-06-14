public class problem_042 {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<n+1;i++){
            if (i%2==0){
                for(int j=0;j<i;j++){
                    System.err.print("0 ");

                }
            }
            else{
                for(int j=0;j<i;j++){
                    System.err.print("1 ");
            }
        }
        System.err.println("");
    }
    
    }
}
