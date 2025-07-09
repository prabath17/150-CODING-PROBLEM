public class problem_122 {
    public static void main(String[] args) {
        String str="WelcomeJava";
        int index=4;
        String add="to";
        int start=0;
        int end=str.length()-index;
        System.out.println(str.substring(start,end)+add+str.substring(end));
    }
}
