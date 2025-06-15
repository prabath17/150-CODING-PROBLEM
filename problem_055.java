public class problem_055 {
    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.err.print("  ");
            }
            for (int k = 1; k <=  i ; k++) {
                System.out.print("*   ");
            }
            System.err.println("");
        }
        for(int i=5;i>0;i--){
            for(int j=n;j>i;j--){
                System.err.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*   ");
            }
            System.err.println("");
        }

    }
}
