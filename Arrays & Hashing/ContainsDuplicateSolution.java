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
        test.containsDuplicate(input1);
        
        // Input 1
        int[] input2 = {1,2,3,1};      
        test.containsDuplicate(input2);                  
    }
}