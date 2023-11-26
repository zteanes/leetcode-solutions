import java.util.HashSet;
import java.util.Set;

public class longest_substring {
    /**
     * Given a string s, find the length of the longest substring without
     * repeating any characters in it.
     * 
     * This is solved used the sliding window algorithm.
     * 
     * @param s string to find the longest substring without repeating
     * @return  length of the longest substring without repeating
     */
    public int lengthOfLongestSubstring(String s) {
        // create a hashset of characters to ints
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;

        // iterate while pointer is in the string boundaries
        while(j < s.length()) {
            // the set doesn't contain the letter at certain point
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j)); // add letter to set
                j++; // increment beginning pointer

                // max value will either be the current size of max, or the size
                // of the new set created
                max = Math.max(max, set.size()); 
            } else { // set contains the letter already
                set.remove(s.charAt(i)); // remove from the set
                i++; // increment second pointer
            }
        }

        return max;
    }

    // test for the method
    public static void main(String[] args) {
        longest_substring sol = new longest_substring();
        assert sol.lengthOfLongestSubstring("abcabcbb") == 3;
        assert sol.lengthOfLongestSubstring("bbbbb") == 1;
        assert sol.lengthOfLongestSubstring("pwwkew") == 3;
        System.out.println("All tests passed!");
    }
}
