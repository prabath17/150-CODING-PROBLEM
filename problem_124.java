public class problem_124 {
    public static void main(String[] args) {
        String str="0000002330422";
        
        for (int i=0;i<str.length();i++){
            char val=str.charAt(i);
            if(val!='0'){
                System.out.println(str.substring(i));
                break;
            }
        }
    }
}
