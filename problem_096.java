public class problem_096 {
    public static void main(String[] args) {
        int a=3521;
        int b=2452;
        int c=1352;
        int i=0;
        int key=0;
        int val;
        while(i<4){
            int x=a%10;
            int y=b%10;
            int z=c%10;
            if(i%2==0){
                val=Math.max(x,Math.max(y, z));
            }
            else{
                val=Math.min(x,Math.min(y, z));
            }
            System.out.println(val);
            key=(int)Math.pow(10, i)*val +key;
            a/=10;
            b/=10;
            c/=10;
            i++;
        }
        System.err.println(key);
    }
}
