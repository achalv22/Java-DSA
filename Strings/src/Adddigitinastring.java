public class Adddigitinastring {
    public static int findSum(String s) {
        int ans = 0;
        String substr = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                substr = substr + s.charAt(i);
                continue;
            }

            if (!substr.equals("")) {
                ans = ans + Integer.parseInt(substr);
                substr = "";
            }
        }
        if (!substr.equals("")) {
            ans = ans + Integer.parseInt(substr);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSum("ubh112qwc3g78"));
    }
}
