public class LongestCommonPrefix {

    public static String longCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder(str[0]);
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(ans.toString()) != 0) {
                ans.deleteCharAt(ans.length() - 1);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longCommonPrefix(strs));
    }

}
