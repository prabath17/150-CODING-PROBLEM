public class problem_041 {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<n+1;i++){
            if (i==1 || i==n){
                for(int j=1;j<n+1;j++){
                    System.err.print("1");
                }
            }
            else{
            System.err.print(i);
            for(int k=1;k<=n-2;k++){
                System.err.print(" ");
            }
            System.err.print("5");

            }
            System.err.println("");
        }
    }
    
}
