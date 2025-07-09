public class problem_118 {
    public static void main(String[] args) {
        String str="racecar";
        for(int i=0;i<str.length()-1;i++){
            int count =0;
            char val_i=str.charAt(i);
            
            for(int j=i+1;j<str.length();j++){
                
                char val_j=str.charAt(j);
                //System.out.println(val_i+"  "+val_j);
                if (val_i==val_j){
                    count++;
                }
                

            }
            if(count!=0){
                    System.out.println(val_i);
                    break;
                }
        }
    }
}

