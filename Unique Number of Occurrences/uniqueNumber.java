import java.util.HashMap;
import java.util.HashSet;

class uniqueNumber {
    public boolean uniqueOccurrences(int[] arr) {
        // map for elements in the array
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 

        // iterate the entire array
        for(int i: arr) {
            if(map.containsKey(i)) { // if the key is in the set, increment the amount by one
                map.put(i, map.get(i) + 1);
            }
            else { // if key is not in the set, set amount to one
                map.put(i, 1);
            }
        }

        // check all the values in the set
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }

    /**
     * main entry point for the program used to test.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        uniqueNumber un = new uniqueNumber();
        int[] nums = {0, 1, 1, 2, 2, 2};
        System.out.println(un.uniqueOccurrences(nums));
    }
}