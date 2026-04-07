public class ChangingCaseInAString {
    public static void main(String[] args) {
        String lastname = "VISHwakarma";
        String ans = "";
        char[] ch = lastname.toCharArray();
        for (char a : ch) {
            if (Character.isUpperCase(a)) {
                ans += String.valueOf(a).toLowerCase();
            } else {
                ans += String.valueOf(a).toUpperCase();
            }
        }
        System.out.println(ans);
    }
}


