package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
