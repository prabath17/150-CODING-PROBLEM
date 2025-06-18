public class problem_095 {
    public static void main(String[] args) {
        int arr[] ={10,5,2,7,8,7};
        int k=3;

        for(int i=k-1;i<arr.length;i++){
            int val=Math.max(arr[i-2],Math.max(arr[i-1], arr[i]));
            System.out.println(val);
        }
        
    }
}
