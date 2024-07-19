package Array;
//Concatenation of Array
public class Solution8 {
  
        public int[] getConcatenation(int[] nums) {
            int len =  nums.length ;
            int [] res = new int [len*2];
    
            for ( int i= 0; i < len; i++){
                res[i] = nums[i];
                res[i+len]=nums[i];
            }
              return res;
            
        }
    
    /*Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]*/
}
