public class problem_121 {
    public static void main(String[] args) {
        String a="goto";
        String b="togoo";
        int acount=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            int val=(int) ch;
            acount+=val;
        }
        //System.out.println(acount);
        int bcount=0;
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            int val=(int) ch;
            bcount+=val;
        }
        //System.out.println(acount);
        if(acount==bcount){
            System.out.println("is an anagram");
        }else{
            System.out.println("is an not anagram");
        }
    }
}
