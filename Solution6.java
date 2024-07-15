// move Zeroes to end of an Array
public class Solution6{
    public int[] moveZeroes(int[] nums ){
          int lenNum = nums.length;
          int index = 0;
          for (int i =0; i<lenNum; i++){
             if (nums[i] != 0 && nums[index] == 0){
               int temp  =  nums[i];
               nums[i] = nums[index];
               nums[index] = temp;
             }
              if (nums[index]!=0){
                index ++;
              }
          }
          return nums;

    }
    public static void main(String [] args){
        Solution6 Solution = new Solution6();
        int []testArray =new int[]{1, 2, 3, 0, 5, 0, 8, 7, 0, 6};
          for (int print1 : testArray){
             System.out.print(print1 + " ");
         }
          System.out.println();
         Solution.moveZeroes(testArray);
         int []res =  Solution.moveZeroes(testArray);
         for (int print : res){
             System.out.print(print + " ");
         }
         System.out.println();
    }
}