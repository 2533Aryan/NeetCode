/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */
class ContainsDuplicateSolution {
    // Logic 1: Here the time complexcity is O(n^2). Need to make it faster!
    // public boolean containsDuplicate(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             if (nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }        
    //     }
    //     return false;
    // }


    // Logic 2
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }        
        }
        return false;
    }

    
    // Test
    public static void main(String[] args) {
        // Test Class
        ContainsDuplicateSolution test = new ContainsDuplicateSolution();

        // Input 1
        int[] input1 = {1,2,3};
        System.out.println(test.containsDuplicate(input1));
        
        // Input 1
        int[] input2 = {1,2,3,1};      
        System.out.println(test.containsDuplicate(input2));
    }
}