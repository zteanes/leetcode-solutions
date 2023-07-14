class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max = 0
        for i in range(len(accounts)):
            curr = 0
            for j in range(len(accounts[i])):
                curr += accounts[i][j]
            if(curr > max):
                max = curr
        return max
    