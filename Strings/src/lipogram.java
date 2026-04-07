public class lipogram {
    public static boolean checkLipogram(String s,char c)
    {
        for (char chr:s.toCharArray())
        {
            if(chr==c)
            {
                return false;
            }
        }
        return true;


    }


    public static void main(String[] args) {
        String s = "abdcefghijklmnopqrstuvwxyz";
        char c='c';
        System.out.println(checkLipogram(s,c));

    }
}
