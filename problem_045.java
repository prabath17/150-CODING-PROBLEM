public class problem_045 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<n+1;i++){
            for (int j=1;j<n-i+2;j++){
                System.err.print(j+" ");
            }
            System.err.println("");
        }
    }
    
}
