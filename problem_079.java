import java.util.Scanner;

public class problem_079 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the array size: : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the "+i+" element:");
            arr[i]=sc.nextInt();

        }
        System.out.println("the middle element is "+arr[n/2]);
    }
    
}
