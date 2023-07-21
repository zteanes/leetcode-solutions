class Solution:
    def isPalindrome(self, s: str) -> bool:
        # use list comprehension to remove all non-alphanumeric characters
        alnum_s = [character for character in s.lower() if character.isalnum()]

        # reverse the list
        reverse_s = alnum_s[::-1]

        # return equality
        return alnum_s == reverse_s
    

if __name__ == '__main__':
    solution = Solution()
    solution.isPalindrome("A man, a plan, a canal: Panama")