public class CountMaxConsecutiveOnes {

    public static int CountMaxConsecutiveones(String num) {

        int max = 0;
        int count = 0;

        int i = 0;
        int j = 0;

        while (j < num.length()) {

            if (num.charAt(j) == '1') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
                i = j + 1;
            }

            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(CountMaxConsecutiveones("11011101111"));
    }
}