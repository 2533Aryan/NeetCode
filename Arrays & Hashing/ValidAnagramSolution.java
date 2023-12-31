import java.util.ArrayList;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {

        // if not equal length, then not anagram
        if (s.length() != t.length()){
            return false;
        } 
        
        // Logic 1: Arraylist

        // Array for String s
        ArrayList<Character> sArray = new ArrayList<Character>(); 
        for (int i = 0; i < s.length(); i++) {
            sArray.add(s.charAt(i));
        }

        // Array for String t
        ArrayList<Character> tArray = new ArrayList<Character>(); 
        for (int i = 0; i < t.length(); i++) {
            tArray.add(t.charAt(i));
        }
        
        // Sorting both arrays
        sArray.sort(null);
        tArray.sort(null);

        // Compares strings ad return true if strings represents the same sequence of characters
        if (sArray.equals(tArray)) {
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

