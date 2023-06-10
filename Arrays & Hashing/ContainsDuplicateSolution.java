/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */
class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
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