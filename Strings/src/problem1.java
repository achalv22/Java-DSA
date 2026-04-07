public class problem1 {
    public static int strStr(String haystack, String needle) {
        int i = 0;
        int j = needle.length();
        while (j <= haystack.length()) {
            String substr = haystack.substring(i, j);
            if (substr.equals(needle)) {
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "butsssssadsadsad";
        String str2 = "sad";
        System.out.println(strStr(str1, str2));
    }
}
