class Solution4{
    public  void maxmim(int []nums){
    int len = nums.length;
    int start = Integer.MIN_VALUE;
    int secoud = Integer.MIN_VALUE;
    for(int i = 0; i < len ; i++){
        if (nums[i]> start){
            secoud = start;
            start = nums[i];
        }if(nums[i] > secoud && nums[i] != start){
           secoud = nums[i];
        }
    }
    System.out.println("The largest number: " +start);
    System.out.println("The second largest number: "+secoud);
}
public void print_array(int []arr){
    System.out.print("the array of element: ");
    for(int print : arr){
        System.out.print( print + " ");
    }
    System.out.println();
}
public static void main(String []args){
    Solution4 tes = new Solution4();
   int []col = {12,32,23,2,3};
   tes.maxmim(col);
   tes.print_array(col);
}
}