from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        Solution to the best time to buy and sell stock question.

        Args:
            prices: List of the prices on each day
        """
        # if empty immediately exit
        if not prices:
            return 0
        
        max = 0 # variable max profit we can make
        min = prices[0] # variable min value we can purchase

        for i in range(1, len(prices)): # loop through the list
            curr = prices[i] - min

            if curr > max: # current profit is greater than our max
                max = curr # reset max
            if prices[i] < min: # the cost for the min is lower that previous
                min = prices[i]
            
        return max

# main to test the solution 
if __name__ == '__main__':
    sol = Solution()

    assert sol.maxProfit([7, 1, 5, 3, 6, 4]) == 5 # passes
    assert sol.maxProfit([7, 6, 4, 3, 1]) == 1 # passes