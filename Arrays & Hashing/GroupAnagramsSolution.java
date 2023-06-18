/*
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order.
 */

import java.util.List;

public class GroupAnagramsSolution {
    
    //Logic 1:
    public List<List<String>> groupAnagrams(String[] strs) {
        return null;        
    }
    
    // Testing
    public static void main(String[] args) {
        
        // Test Class
        GroupAnagramsSolution test = new GroupAnagramsSolution();

        // Test 1
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(test.groupAnagrams(strs1));

        // Test 2
        String[] strs2 = {""};
        System.out.println(test.groupAnagrams(strs2));

        // Test 3
        String[] strs3 = {"a"};
        System.out.println(test.groupAnagrams(strs3));
    }    
}
