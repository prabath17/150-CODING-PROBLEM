public class problem_078 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={2,3,6,5,4};
        boolean flag=true;
        for(int i : a){
            int count=0;
            for(int j:b){
                if(i==j){
                    count++;
                }
            }
            if(count==0){
                System.out.println("both arrays contains different elements ");
                flag=false;
            }
        }
        if(flag){
        System.out.println("both arrays contains same element");
        }
    }
    
}
