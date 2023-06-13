public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        for ( i : s.chars()) {
            
        }
        
        System.out.println();
        // Compares strings ad return true if strings represents the same sequence of characters
        if (s.equals(t)) {
            return true;
        }
        
        // Not anagram
        return false;
    }    

    // Testing
    public static void main(String[] args) {
        ValidAnagramSolution solution = new ValidAnagramSolution();
        
        // Test 1
        String s1 = "anagram";
        String t1 = "nagaram";

        System.out.println(solution.isAnagram(s1, t1));

        // Test 2
        String s2 = "rat";
        String t2 = "car";

        System.out.println(solution.isAnagram(s2, t2));
    }
}
