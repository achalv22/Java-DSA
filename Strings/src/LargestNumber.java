public class LargestNumber {
    public static String largestNumber(int[] nums)
    {
        String s="";
        for (int i=0;i<= nums.length-1;i++)
        {
           s+=nums[i];
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String sortedarr=new String(arr);
   return sortedarr;
    }
    public static void main(String[] args)
    {
      int []nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}
