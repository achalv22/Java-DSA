public class LengthOfLastWord {

    public static boolean isAlphabet(char c) {
        return ((c >= 65 && c <= 90) || (c >= 97 && c <= 122));
    }

    public static int lengthofLastWord(String s) {
        s = s.trim();
        int i = s.length() - 1;
        int len = 0;
        while (i >= 0 && isAlphabet(s.charAt(i))) {
            i--;
            len++;
        }
        return len;
    }

    public static boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i) - 97]--;
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "a";
//        System.out.println(lengthofLastWord(s));
        System.out.println(isAnagram("rat", "car"));
    }
}

