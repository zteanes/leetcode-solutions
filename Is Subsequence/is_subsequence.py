class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s_cnt, t_cnt = 0, 0 # declare pointers
        s_len, t_len = len(s), len(t) # get lengths
        while s_cnt < s_len and t_cnt < t_len:
            if s[s_cnt] == t[t_cnt]: # check equality of two letters
                s_cnt += 1 # if two are the same, iterate both pointers
                t_cnt += 1
            else: # if they're not the same
                t_cnt += 1 # only iterate string we're trying to find subsequence in

        return s_cnt == len(s) # if s never gets to the same length, we know no subsequence

if __name__ == "__main__":
    sol = Solution()

    print(sol.isSubsequence("abc", "ahdbedc"))