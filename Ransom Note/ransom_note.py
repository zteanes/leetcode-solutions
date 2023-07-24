from collections import Counter
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        """
        See if we can construct a note from a magazine.
        My solution using the removal of characters from ransomNote.

        Args:
            ransomNote (str): The note we want to construct
            magazine (str): The magazine we have
        
        Returns:
            bool: True if we can construct the note, False otherwise
        """
        for i in magazine: # iterate all the characters in magazine
            if i in ransomNote: # if character in ransomNote, remove it from ransomNote
                ransomNote = ransomNote.replace(i, "", 1)
        
        return not ransomNote # if ransomNote is empty, return True, else False
    
    def canConstructCont(self, ransomNote: str, magazine: str) -> bool:
        """
        See if we can construct a note from a magazine
        Solution idea from leetcode using the Counter class,
        Counter is a dict subclass for counting hashable objects

        Args:
            ransomNote (str): The note we want to construct
            magazine (str): The magazine we have
        
        Returns:
            bool: True if we can construct the note, False otherwise
        """
         # count the number of each character in ransomNote and magazine
        cnt1, cnt2 = Counter(ransomNote), Counter(magazine)

        if cnt1 & cnt2 == cnt1: # if cnt1 is a subset of cnt2
            return True
        return False
    

if __name__ == "__main__":
    sol = Solution() # create an instance of the class

    # Test cases w/ my solution
    test1 = sol.canConstruct("a", "b")  # ransomNote cannot be constructed from magazine
    test2 = sol.canConstruct("aa", "ab")  # ransomNote cannot be constructed from magazine
    test3 = sol.canConstruct("aa", "aab")  # ransomNote can be constructed from magazine
    test4 = sol.canConstruct("abc", "ababc")  # ransomNote can be constructed from magazine
    test5 = sol.canConstruct("xyz", "abc")  # ransomNote cannot be constructed from magazine

    # Test cases w/ leetcode inspired solution
    test6 = sol.canConstructCont("a", "b")  # ransomNote cannot be constructed from magazine
    test7 = sol.canConstructCont("aa", "ab")  # ransomNote cannot be constructed from magazine
    test8 = sol.canConstructCont("aa", "aab")  # ransomNote can be constructed from magazine
    test9 = sol.canConstructCont("abc", "ababc")  # ransomNote can be constructed from magazine
    test0 = sol.canConstructCont("xyz", "abc")  # ransomNote cannot be constructed from magazine

    # Expected outputs: False, False, True, True, False
    assert test1 == False
    assert test2 == False
    assert test3 == True
    assert test4 == True
    assert test5 == False
    assert test6 == False
    assert test7 == False
    assert test8 == True
    assert test9 == True
    assert test0 == False

    print("All test cases passed!")