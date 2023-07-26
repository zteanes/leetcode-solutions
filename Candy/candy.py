from typing import List

class Solution:
    def candy(self, ratings: List[int]) -> int:
        """
        Solution to the candy problem in candy.txt

        Parameters:
            ratings (List[int]): List of ratings for each child

        Returns:
            int: Minimum number of candies needed to give out
        """
        # if there are no ratings, return 0
        if not ratings or len(ratings) == 0:
            return 0

        
        # create an array to count candies same size as ratings and all starting with 1
        candies = [1] * len(ratings)
        length = len(ratings)

        # go from left to right, if the prev is less than current, increase current by 1
        for i in range(1, length):
            if ratings[i] > ratings[i - 1]:
                candies[i] = candies[i - 1] + 1

        # go from right to left, if current is greater than next, make it next + 1
        for i in range(length - 2, -1, -1):
            if ratings[i] > ratings[i + 1]:
                candies[i] = max(candies[i], candies[i + 1] + 1)
        
        # get sum of candies
        sum = 0
        for i in range(length):
            sum += candies[i]

        return sum

        
if __name__ == '__main__':
    sol = Solution()

    print(sol.candy([1,0,2]))

