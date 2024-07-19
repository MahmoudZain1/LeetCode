package Array;
//the Missing Number in an Array
public class Solution7 {
    public static void main(String[] args) {
        int[] x = {1, 2, 4,5}; //5
        int n = x.length + 1; //5
        int expected= n * (n + 1) / 2; //15
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i]; //12
        }

        int missingNumber = expected - sum; //3
        System.out.println("The missing number is: " + missingNumber);
    }
}
