"""
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s_cnt, t_cnt = 0, 0 # declare pointers
        while s_cnt < len(s) and t_cnt < len(t):
            if s[s_cnt] == t[t_cnt]: # check equality of two letters
                s_cnt += 1 # if two are the same, iterate both pointers
                t_cnt += 1
            else: # if they're not the same
                t_cnt += 1 # only iterate string we're trying to find subsequence in

        return s_cnt == len(s) # if s never gets to the same length, we know no subsequence
"""

# more efficient solution found from what others did; similar idea

class Solution:
    def isSubsequence(self, s: str, t:str) -> bool:
        p1 = p2 = 0 # grab pointers

        while p1 < len(s) and p2 < len(t): # loop while valid
            if s[p1] == t[p2]: # check equality of two letters
                p1 += 1 # if same increment both pointers, if not just t pointer
            p2 += 1
        
        return p1 == len(s) # if s never gets to the same length, no subsequence
    
if __name__ == "__main__":
    sol = Solution()
    print(sol.isSubsequence("abc", "ahdbedc"))