public class problem_052 {
    public static void main(String[] args) {
        
        int n=2;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("{ } ");
            for (int j = 2; j <= i; j++) {
                // Print j pairs of nested braces
                for (int k = 1; k <= j; k++) System.out.print("{");
                System.out.print(" ");
                for (int k = 1; k <= j; k++) System.out.print("}");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
