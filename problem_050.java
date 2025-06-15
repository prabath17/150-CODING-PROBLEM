public class problem_050 {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<n+1;i++){
            for(int a=1;a<i;a++){
                System.err.print("  ");
            }

            for(int j=69+1-i;j>=65;j--){
                char k=(char)+j;
                System.err.print(k+" ");
            }
            System.err.println("");
        }
    }
    
}
