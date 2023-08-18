from typing import List


class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.

        Rules:
        1 - any live cell with less than 2 neighbors dies by underpopulation
        2 - any live cell with 2 or 3 live neighbors lives
        3 - any live cell with more than 3 neighbors dies by overpopulation
        4 - any dead cell with exactly 3 neighbors becomes living
        """

        # helped method that ensures validity of spacing in board
        def is_valid(x, y):
            return len(board) > x >= 0 and len(board[0]) > y >= 0

        # define a list of all possible directions for each x and y
        direction_x = [0, 0, 1, 1, 1, -1, -1, -1]
        direction_y = [1, -1, 1, -1, 0, 0, 1, -1]

        # get our lengths for board sides
        m = len(board)
        n = len(board[0])

        # loop entire board
        for row in range(m):
            for col in range(n):
                # count all the live neighbors
                neighbors = 0
                for i in range(len(direction_x)):
                    # get the index for the direction around current row
                    # from current place and possible direction together
                    current_x, current_y = row + direction_x[i], col + direction_y[i]

                    # check validity of direction, if valid get value for current place
                    if is_valid(current_x, current_y) and abs(board[current_x][current_y]) == 1:
                            neighbors += 1

                # when neighbors is less than two, dies from underpopulation
                # when neighbors is greater than three, dies from overpopulation
                if board[row][col] == 1 and (neighbors < 2 or neighbors > 3):
                    board[row][col] = -1  # -1 means live -> dead

                # when neighbors is 3, dead space comes alive
                if board[row][col] == 0 and neighbors == 3:
                    board[row][col] = 2  # 2 means dead -> live

        # get final board
        for row in range(m):
            for col in range(n):
                if board[row][col] >= 1:
                    board[row][col] = 1
                else:
                    board[row][col] = 0


# create driver to test
if __name__ == "__main__":
    board = [[0, 1, 0], [0, 0, 1], [1, 1, 1], [0, 0, 0]]
    Solution().gameOfLife(board)
    print(board)  # should print [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
