public class PossiblePallindromeInAString {
    public static int findPallindrom(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "aabbbaa";
        // int j=1;
        //int i=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substr = s.substring(i, j);
                int ans = findPallindrom(substr);
                if (ans == 0) {
                    System.out.println(substr);
                }
            }
        }

    }
}
