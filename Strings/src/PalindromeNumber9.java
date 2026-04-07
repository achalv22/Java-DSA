public class PalindromeNumber9 {
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int j=s.length()-1;
        int i=0;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
