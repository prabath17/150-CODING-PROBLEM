
//import java.util.Arrays;


//import java.util.Arrays;

public class problem_105 {
    public static void main(String[] args) {
        String inp1="Fi_er";
        String inp2="Fever:Filer:Filter:FIxer:Fiber:Fibre:Tailor:Offer";
        String[] arr=inp2.split(":");
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){

            int count=0;
            if(inp1.length()==arr[i].length()){
                for(int j=0;j<inp1.length();j++){
                    if(inp1.charAt(j)=='_'){

                        count++;
                    }
                    else if (inp1.charAt(j)==arr[i].charAt(j)) {
                        count++;
                    }
                }
            }
            if(count==arr[i].length()){
                System.out.println(arr[i]);

            }
        }
    }
}
