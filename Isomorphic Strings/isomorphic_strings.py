class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_s = []  # create two sets
        map_t = []
        for i in s: # iterate and make map of indices
            map_s.append(s.index(i))
        for j in t:
            map_t.append(t.index(j))
        # see if they have the same index for all values
        return True if map_s == map_t else False

# driver to test the code
if __name__ == '__main__':
    solution = Solution()
    assert solution.isIsomorphic("egg", "add") == True
    assert solution.isIsomorphic("foo", "bar") == False
    assert solution.isIsomorphic("paper", "title") == True
    assert solution.isIsomorphic("badc", "baba") == False
    assert solution.isIsomorphic("ab", "aa") == False
    assert solution.isIsomorphic("ab", "ca") == True

    print("All tests passed!")