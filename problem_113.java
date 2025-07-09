public class problem_113 {
    public static void main(String[] args) {
        String str="I love programming in python language";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                arr[i]= new StringBuilder(arr[i]).reverse().toString();
            }
        }
        for(String i:arr){
            System.out.println(i);
        }
    }
}
