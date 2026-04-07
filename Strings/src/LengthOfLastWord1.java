public class LengthOfLastWord1 {
    public static int lengthofLastWord(String s) {

         String []sp=s.split(" ");
        int len=sp[sp.length-1].length();
        return len;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthofLastWord(s));
    }
}


