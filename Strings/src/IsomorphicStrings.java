import java.util.Arrays;
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int []a=new int[s.length()];
        int []b=new int[t.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.indexOf(s.charAt(i));
            b[i] = t.indexOf(t.charAt(i));
        }

        return (Arrays.equals(a,b));

    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("aaeaa","uuxyy"));
    }
}
