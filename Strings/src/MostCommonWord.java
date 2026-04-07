public class MostCommonWord {
    public static String commonword(String str, String []banned) {
            String s =str.toLowerCase();
            for (String bw : banned) {
                s=s.replaceAll("\\b" + bw.toLowerCase() + "\\b", " ");
            }
            String[] words =s.replaceAll("[^a-z]", " ").split("\\s+");

            int maxcount = 0;
            String ans = "";

            for (int i = 0; i < words.length; i++) {
                if (words[i].isEmpty()) continue;

                int count = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) count++;
                }

                if (count > maxcount) {
                    maxcount = count;
                    ans = words[i];
                }
            }

            return ans;
        }



    public static void main(String[] args) {
        String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(commonword(s, banned));
    }
}
