public class ComplementofBase10Integer {
    public static void main(String[] args) {
        int n=0;
        int i=1;
        int mask=0;
        while(n>mask)
        {
            mask=1<<(i-1);
            if (mask<0)
            {
               // return 1;
            }
            n=n^(mask);

            i++;
        }
        System.out.println(n);
    }
}
