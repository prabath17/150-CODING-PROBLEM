public class problem_046 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<i;j++){
                System.err.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.err.print(k+"");
            }
            System.err.println("");
        }
    }
    
}
