import java.util.HashSet;

public class problem_075 {
    public static void main(String[] args) {
        int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        HashSet <Integer> uni=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            uni.add(arr[i]);
        }
        System.out.println(uni);
    }
    
}
