public class problem_112 {
    public static void main(String[] args) {
        String str="apple banana mango apple grape";
        String match="apple";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(match)){
                arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            }
        }
        for(String i:arr){
            System.out.println(i);
        }
    }
}
