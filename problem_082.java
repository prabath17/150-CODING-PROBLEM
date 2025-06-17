import java.util.Arrays;

class problem_082{
    public static void main(String[] args){
        //System.out.println("hi");
        int[] org={0, -1, 2, -3, 1};
        int[] arr={-3, -1, 0, 1, 2};
        int tar=-2;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        System.out.println(Arrays.toString(arr));
        while(i<j){
            if(arr[j]+arr[i]==tar){
                
                
                for(int k=0;k<arr.length;k++){
                    //System.out.println(arr[k]);
                    //System.out.println(org[k]);
                    if(arr[i]==org[k] || arr[j]==org[k]){
                        System.out.println(k);
                    }
                }
                break;
            }
            else if(arr[i]+arr[j]>tar){
                j--;
            }
            else{
                i++;
            }
        }

    }
}