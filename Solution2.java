// Find Minimum Operations to Make All Elements Divisible by Three
class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0;
        for (int num : nums) {
            int res = num % 3;
            if (res == 1) {
                op += 1; 
            } else if (res  == 2) {
                op += 1; 
            }
        }
        
        return op;
        }
}