public class problem_032 {
    public static void main(String[] args) {
        int n=1245;
        boolean flag=true;
        while(n>9){
            int val =(n%100)/10 - (n%10);
                if (val==1 || val==-1){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            n/=10;
        }
        System.err.println(flag);
    }
    
}
