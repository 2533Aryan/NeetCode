/*
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order.
 */

import java.util.ArrayList;
import java.util.List;

public class GroupAnagramsSolution {
    
    //Logic 1:
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Result
        // List<List<String>> group;
        
        // Arraylist to store all inputs
        ArrayList<String> allInputs = new ArrayList<String>();

        // input all values into arraylist
        for (String string : strs) {
            allInputs.add(string);
        }

        // one set of anagram

        ArrayList<String> completeSets = new ArrayList<String>();

        for (int i = 0; i < allInputs.size(); i++) {
            ArrayList<String> sets = new ArrayList<String>();
            // Add the index element
            sets.add(allInputs.get(i));

            // Loop to check other elements
            for (int j = 1; j < allInputs.size(); j++) {
                if (isAnagram(allInputs.get(i), allInputs.get(j))) {
                    sets.add(allInputs.get(j));
                    allInputs.remove(j);
                }
            }
            
            allInputs.remove(i);
            completeSets.addAll(sets);
        }

        // String str1 = "eat";
        // String str2 = "tee";
                
        // // Check is it's anagram
        // System.out.println(isAnagram(str1, str2));        
        
        return null;        
    }


    // Check is two strings are anagrams
    public boolean isAnagram(String str1, String str2){

        // length not same - not anagram
        if (str1.length() != str2.length()){
            return false;
        }
        
        // Character list
        ArrayList<Character> s1 = new ArrayList<Character>();
        ArrayList<Character> s2 = new ArrayList<Character>();

        // Adding values to s1 list
        for (int i = 0; i < str1.length(); i++) {
            s1.add(str1.charAt(i));
        }

        // Adding values to s2 list
        for (int i = 0; i < str2.length(); i++) {
            s2.add(str2.charAt(i));
        }

        // Sort lists
        s1.sort(null);
        s2.sort(null);
        
        // check the whole list is same
        if (s1.equals(s2)) {
            return true;
        }
        
        // Otherwise false
        return false;
    }        

    
    // Testing
    public static void main(String[] args) {
        
        // Test Class
        GroupAnagramsSolution test = new GroupAnagramsSolution();

        // Test 1
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        test.groupAnagrams(strs1);
        // System.out.println(test.groupAnagrams(strs1));

        // // Test 2
        // String[] strs2 = {""};
        // System.out.println(test.groupAnagrams(strs2));

        // // Test 3
        // String[] strs3 = {"a"};
        // System.out.println(test.groupAnagrams(strs3));
    }    
}
