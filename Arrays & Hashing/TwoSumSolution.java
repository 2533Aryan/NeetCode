import java.util.ArrayList;

public class TwoSumSolution {
    // Logic 1: 
    public int[] twoSum(int[] nums, int target) {
        // Output Array
        int[] sumArray = new int[2];
        
        for (int i = 0; i < nums.length-1; i++) {
            // Declare values
            sumArray[0] = nums[i];
            sumArray[1] = nums[i+1];              

            // Two sum
            int twoSum = sumArray[0] + sumArray[1];

            // Find the target
            if (twoSum == target){
                return sumArray;        
            }
        }
        
        // Return the output
        return null;
    }
    
    // Testing
    public static void main(String[] args) {
        // Test Class        
        TwoSumSolution test = new TwoSumSolution();
        
        // Test 1
        int[] nums1 = {2,7,11,15}; 
        int target1 = 9;
        // Print Test
        int[] arrayTest1 = test.twoSum(nums1, target1);
        System.out.print(arrayTest1[0]);
        System.out.print(" ");
        System.out.print(arrayTest1[1]);

        System.out.println();

        // Test 2
        int[] nums2 = {3,2,4};
        int target2 = 6;
        // Print Test
        int[] arrayTest2 = test.twoSum(nums2, target2);
        System.out.print(arrayTest2[0]);
        System.out.print(" ");
        System.out.print(arrayTest2[1]);
        
        System.out.println();
        
        // Test 3
        int[] nums3 = {3,3};
        int target3 = 6;
        // Print Test
        int[] arrayTest3 = test.twoSum(nums3, target3);
        System.out.print(arrayTest3[0]);
        System.out.print(" ");
        System.out.print(arrayTest3[1]);
    }
}
