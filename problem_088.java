public class problem_088 {
    public static void main(String[] args) {
        int[] arr={ 1, 5, 6, 1, 9, 5, 8, 10, 8, 9 };
        int count=arr.length;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(curr==arr[j]){
                    count++;
                }
            }
        }
        System.err.println(count);
    }
    
}
