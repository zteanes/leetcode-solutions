class Solution:
    def isValid(self, s: str) -> bool:
        # library of our valid braces
        lib = dict(('()', '[]', '{}'))

        # "stack" of our pathing/braces
        braces = []

        for c in s: # loop all characters in the string
            if c in '([{': # see if it's an opening brace
                braces.append(c) # add to stack
            
            # see if there's an no opening or if it's a matching opening/closing
            elif len(braces) == 0 or c != lib[braces.pop()]:
                return False
        
        return len(braces) == 0


if __name__ == '__main__':
    sol = Solution()

    assert sol.isValid("()") == True

