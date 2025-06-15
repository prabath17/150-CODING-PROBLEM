public class problem_065 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int g=arr[0];
        int c=arr[0];
        for(int i=1;i<arr.length;i++){
            c=Math.max(c+arr[i], arr[i]);
            g=Math.max(g, c);
        }
        //System.err.println(c);
        System.err.println(g);
    }
    
}
