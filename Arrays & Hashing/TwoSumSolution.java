import java.util.ArrayList;

public class TwoSumSolution {
    // Logic 1: 
    public int[] twoSum(int[] nums, int target) {
        // Output Array
        int[] sumArray = new int[2];
        
        // Return the output
        return sumArray;
    }
    
    // Testing
    public static void main(String[] args) {
        // Test Class        
        TwoSumSolution test = new TwoSumSolution();
        
        // Test 1
        int[] nums1 = {2,7,11,15}; 
        int target1 = 9;
        System.out.println(test.twoSum(nums1, target1));

        // Test 2
        int[] nums2 = {3,2,4};
        int target2 = 6;
        System.out.println(test.twoSum(nums2, target2));

        // Test 3
        int[] nums3 = {3,3};
        int target3 = 6;
        System.out.println(test.twoSum(nums3, target3));
    }
}
