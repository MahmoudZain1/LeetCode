//reverse an array 
public class Solution3 {
    public void reverse(int []numbers,int start , int end){
        while(start < end){
        int temp = numbers[start];
         numbers[start]=numbers[end];
         numbers[end] = temp;
         start++;
         end--;
        }
    }
}
