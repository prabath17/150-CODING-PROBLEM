public class problem_057 {
    public static void main(String[] args) {
        int [] arr={12, 3, 1, 10, 34, 1};
        int max1=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if (arr[i]>max2 && max1!=arr[i]){
                max2=arr[i];
            }
        }
        System.err.println("MAX 1 ="+max1);
        System.err.println("MAX 2 ="+max2);
    }
    
}
