public class problem_044 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n+1;i++){
            for(int j=n;0<j-i;j--){
                System.err.print("  ");
            }
            for(int k=1;k<i+1;k++){
                System.err.print(k+" ");
            }
            System.err.println("");
        }
    }
    
}
