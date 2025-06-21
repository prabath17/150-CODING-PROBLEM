public class problem_097 {
    public static boolean isValidIdentifier(String s) {
        if (s == null || s.isEmpty()) return false;

        // First character must be a letter, underscore, or dollar sign
        if (!Character.isLetter(s.charAt(0)) && s.charAt(0) != '_' && s.charAt(0) != '$') {
            return false;
        }

        // Remaining characters must be letters, digits, underscores, or dollar signs
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_' && ch != '$') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {"_valid1", "1invalid", "class", "$name", "validName"};

        for (String test : testCases) {
            System.out.println(test + " ? " + (isValidIdentifier(test) ? "Valid" : "Invalid"));
        }
    }
}
