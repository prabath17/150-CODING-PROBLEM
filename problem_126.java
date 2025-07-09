public class problem_126 {
    public static void main(String[] args) {
        String str="khoor";
        String res="";
        for(int i=0;i<str.length();i++){
            int ord=(int) str.charAt(i);
            ord=ord-3;
            char val=(char) ord ;
            res=res + val+"";
            //System.out.println(val);
        }
        System.out.println(res);
    }
}
