public class problem_053 {
    public static void main(String[] args) {
        int n=8;
        for(int i=n;i>=0;i--){
            for (int s = 0; s < n - i; s++){
                System.err.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*   ");
            }
            System.err.println("");
        }
        for(int i=2;i<=n;i++){
            for (int s = 0; s < n - i; s++)
            {
                System.err.print("  ");
            }
            for (int k = 1; k <=  i ; k++) {
                System.out.print("*   ");
            }
            System.err.println("");
        }
    }
    
}
