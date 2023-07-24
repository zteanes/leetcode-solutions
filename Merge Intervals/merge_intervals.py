from typing import List

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        """
        Given a collection of intervals, merge all overlapping intervals.

        Args:
            intervals (List[List[int]]): list of intervals

        Returns:
            List[List[int]]: list of merged intervals
        """
        intervals.sort(key = lambda x: x[0]) # sort by start num
        merged = [] # list of merged intervals
        
        for interval in intervals: # for each interval
            if not merged or merged[-1][1] < interval[0]: # if merged is empty or no overlap
                merged.append(interval) # add interval to merged
            else:
                merged[-1][1] = max(interval[1], merged[-1][1]) # update end num of last interval in merged
                
        return merged # return merged intervals
    

if __name__ == '__main__':
    sol = Solution()

    # create our test cases
    intervals1 = [[1,3],[2,6],[8,10],[15,18]]
    intervals2 = [[1,4],[4,5]]
    intervals3 = [[1,4],[0,4]]
    intervals4 = [[1,4],[2,3]]
    intervals5 = []

    # run our test cases
    assert sol.merge(intervals1) == [[1,6],[8,10],[15,18]]
    assert sol.merge(intervals2) == [[1,5]]
    assert sol.merge(intervals3) == [[0,4]]
    assert sol.merge(intervals4) == [[1,4]]
    assert sol.merge(intervals5) == []

