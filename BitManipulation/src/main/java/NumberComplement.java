public class NumberComplement {
    public static void main(String[] args) {
        int num=5;
        int ans=0;
        while(num!=0)
        {
            ans=ans+(num^1);
            num=num>>1;
        }
        System.out.println(ans);
    }
}
