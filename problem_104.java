public class problem_104 {
    public static void main(String[] args) {
        String s="xYzAb";
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if (Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i + 1))){
                count++;
            }
        }
        System.out.println(count);
    }
}
