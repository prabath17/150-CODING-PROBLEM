public class problem_098 {
    
//        String str = "Java is awesome";
 //       String[] words = str.split(" ");
  //      System.out.println(words.length); // Output: 3
       
    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isWhitespace(ch)) {
                inWord = false;
            } else if (!inWord) {
                count++;
                inWord = true;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "    Java  is  powerful  ";
        System.out.println("Total words: " + countWords(s));  // Output: 3
    }
}


    
