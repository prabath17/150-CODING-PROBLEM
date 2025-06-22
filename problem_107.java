import java.util.HashSet;
import java.util.Set;

public class problem_107 {
    //public static void main(String[] args) {
        //Input1=="my name is granar";
        //Input2='a';
        //Output=7
        //String s="my name is granar";
        //HashSet <Character> set =new HashSet<>();
        //for(int i=0;i<s.length();i++){
        //    set.add(s.charAt(i));
        //}
        //System.out.println(set);
    //}
    public static int countUniqueAroundChar(String str, char target, int distance) {
        Set<Character> uniqueChars = new HashSet<>();
        str = str.replaceAll(" ", ""); // optional: ignore spaces

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                int start = Math.max(0, i - distance);
                int end = Math.min(str.length() - 1, i + distance);

                for (int j = start; j <= end; j++) {
                    if (j != i) {
                        uniqueChars.add(str.charAt(j));
                    }
                }
            }
        }

        return uniqueChars.size();
    }

    public static void main(String[] args) {
        String input1 = "my name is granar";
        char input2 = 'a';

        int result = countUniqueAroundChar(input1, input2, 2);
        System.out.println("Output: " + result); // Expected Output: 7
    }
}
/*✅ Explanation for "my name is granar":
Positions of 'a': index 4, 13, 15
Characters within ±2 (excluding the 'a' itself):

around index 4 → 'n', 'e', 'm'

around index 13 → 'n', 'a', 'r'

around index 15 → 'a', 'r'

Unique characters collected: 'n', 'e', 'm', 'r', 'a' → total = 7 */