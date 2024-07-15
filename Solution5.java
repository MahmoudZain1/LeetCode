//Sort People by Height 
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len_name = names.length; // Get the length of the names array
        int len_hei = heights.length; // Get the length of the heights array
    
        if (len_name == len_hei) { // Check if both arrays have the same length
            String[] result = new String[len_name]; // Create an array to store the sorted names
            Integer[] indices = new Integer[len_name]; // Create an array to store the indices
            
            for (int i = 0; i < len_name; i++) {
                indices[i] = i; // Populate the indices array with values from 0 to len_name - 1
            }

            Arrays.sort(indices, (a, b) -> heights[b] - heights[a]); // Sort indices based on corresponding heights in descending order

            for (int i = 0; i < len_name; i++) {
                result[i] = names[indices[i]]; // Populate the result array with names based on sorted indices
            }
            
            return result; // Return the sorted names array
        } else {
            throw new IllegalArgumentException("The lengths of names and heights arrays must be equal."); // Throw an exception if array lengths are not equal
        }
    }
}
