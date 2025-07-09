public class problem_110 {
    public static void main(String[] args) {
        String str="helloworld";
        int mid =str.length()/2;
        System.out.println(str.substring(0,mid)+str.substring(mid).toUpperCase());

    }
}
