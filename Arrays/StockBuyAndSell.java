package array;

public class StockBuyAndSell {
    public static int findMaxProfit(int arr[])
    {
        int max=0;
        int profit=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]) {
                     profit= arr[j] - arr[i];
                if (profit>max)
                    max=profit;
                }
            }

        }
        return  max;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(findMaxProfit(arr));
    }
}
