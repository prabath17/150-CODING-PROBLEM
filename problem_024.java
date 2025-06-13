public class problem_024 {
    public static void main(String[] args) {
        
        int num=50113;
        while(num>=10){
            num=Sum(num);
        }
        if(num==1){
            System.err.println("magic number");
        }
        else{
            System.err.println("not magic number");
        }
    }

        public static int Sum(int num){
        int sum=0;
        while (num>0){
            int last=num%10;
            sum+=last;
            num/=10;
        }
        return sum;

    }
}
    
    

