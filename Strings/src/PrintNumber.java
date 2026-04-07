public class PrintNumber {
    public static int printnumber(String str) {
            String ans = "";
            int i = 0;


            while (i < str.length()) {
                if ((str.charAt(i) == '+' || str.charAt(i) == '-') && ans.length() == 0) {
                    ans += str.charAt(i);
                }
                else if (Character.isDigit(str.charAt(i))) {
                    ans += str.charAt(i);
                }
                else if(Character.isSpaceChar(str.charAt(i)) && Character.isAlphabetic(str.charAt(i+1))) {
                    break;
                }

                else if (ans.length() > 0) {
                    break;
                }
                i++;
            }
            if (ans.equals("") || ans.equals("+") || ans.equals("-"))
                return 0;
        long num=Long.parseLong(ans);
        if (num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (num < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return Integer.parseInt(ans);

        }


    public static void main(String[] args) {
//        System.out.println(printnumber("-453fsdgds534"));
//        System.out.println(printnumber("fdvr 45"));
//        System.out.println(printnumber("fdgf5.0"));
//        System.out.println(printnumber("fdf+67.0g"));
//        System.out.println(printnumber("fdf+67.0"));
//        System.out.println(printnumber("+0"));
//        System.out.println(printnumber("43"));
//        System.out.println(printnumber("-067"));
//        System.out.println(printnumber("0-1"));
//        System.out.println(printnumber("++1"));
//        System.out.println(printnumber(" words and 987"));
//        System.out.println(printnumber("-91283472332"));
        System.out.println(printnumber(".1"));
//        System.out.println(printnumber("1.2"));
    }
}
