public class VowelsAndConsonents {
    public static void main(String[] args) {
        String s = "ai96bvgoasdfghjkrtyuivbm#%&*";
        // String vovals="aeiouAEIOU";
        char[] ch = s.toCharArray();
        //char[] ch1=vovals.toCharArray();
        String vovals = "";
        String consonents = "";

      /*  for (Character c: ch)
        {
            for (Character c1:ch1){
                if(c.{
                    System.out.println(c);
                }
            }
        }*/
        for (Character c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vovals += c;
            } else {
                if (Character.isAlphabetic(c)) {
                    consonents += c;
                }
            }
        }
        System.out.println("vovals : "+vovals);
        System.out.println("consonents : "+consonents);
    }
}
