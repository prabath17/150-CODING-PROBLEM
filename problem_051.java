public class problem_051 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        int vount=0;
        int start=65;
        int end=69;
        for(int i=1;i<=5;i++){
            if(i%2!=0){
                
                for(int j=end-count;j>=start+count;j--){
                    System.err.print((char)+j+" ");
                }
                count++;
            }
            else{
                for(int k=start+vount;k<=end+vount+1-i;k++){
                    System.err.print((char)+k+" ");
                }
                vount++;
            }
            System.err.println("");
        }
    }
    
}
