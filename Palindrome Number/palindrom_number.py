class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0: # if a negative, cannot be a palindrome
            return False
        num = x # create variables for original and 
        rev = 0 # reversed number

        while num > 0: # while loop to reverse the number
            rev = rev * 10 + num % 10 # multiply by 10 to move the digit to the left
            num = num // 10 # divide by 10 to move the digit to the right

        return rev == x # return if the reversed number is equal to the original number
    
# Driver code
if __name__ == "__main__":
    solution = Solution()  # Create an instance of the Solution class

    # Test cases
    test_cases = [121, 1331, 4554, 123, -121]

    # each test case and assert if it is a palindrome or not
    assert solution.isPalindrome(test_cases[0]) == True
    assert solution.isPalindrome(test_cases[1]) == True
    assert solution.isPalindrome(test_cases[2]) == True
    assert solution.isPalindrome(test_cases[3]) == False
    assert solution.isPalindrome(test_cases[4]) == False