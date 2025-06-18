public class problem_091 {
    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        int c=arr[0];
        int g=arr[0];
        for(int i=1;i<arr.length;i++){
            c=Math.max(arr[i], c+arr[i]);
            g=Math.max(c, g);
        }
        System.out.println(g);
    }
    
}
