package Array;
//Number of Good Pairs
class Solution9 {
    public int numIdenticalPairs(int[] nums) {
        int len = nums.length;
       int GoodPairs = 0;
        for ( int i = 0; i< len; i++){
            for ( int j = i+1; j < len; j++){
                if ( nums[i] == nums[j]){
                    GoodPairs++;
                }
            }
        }
        return GoodPairs;
    }
}
/*Input: nums = [1,2,3,1,1,3]
Output: 4 
(index 0, index 1) => Value at index 0 is 1 and value at index 1 is also 1.
(index 0, index 2) => Value at index 0 is 1 and value at index 2 is also 1.
(index 0, index 3) => Value at index 0 is 1 and value at index 3 is also 1.
(index 1, index 2) => Value at index 1 is 1 and value at index 2 is also 1.
(index 1, index 3) => Value at index 1 is 1 and value at index 3 is also 1.
(index 2, index 3) => Value at index 2 is 1 and value at index 3 is also 1.
*/
