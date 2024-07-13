//How Many Numbers Are Smaller Than the Current Number
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[]reslut = new int[len];
        for (int i = 0 ;  i < len; i++){
        int count = 0;
            for (int j = 0; j < len; j++){
                if (nums[i] > nums[j]){
                 count++;}
            }
             reslut[i] = count;
        }
        return reslut;
    }
    public static void main(String []args){
        Solution solution =new Solution();
        int []array ={80,100,50,40,60};
                          
        int []res =  solution.smallerNumbersThanCurrent(array);
         for(int print : res){
            System.out.print(print+ " ");
         }
         System.out.println();
    }

}
