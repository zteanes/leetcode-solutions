class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        """
        Given a pattern and a string, see if the string follows the pattern.

        pattern - a string of lowercase English letters to be followed; ex: abba
        s - a string to words to see if they match a pattern
        """
        # Create a map of the letters
        letters = {}

        # Create a map of the words
        words = {}

        # Split the string into a list of words
        list_words = s.split()

        # If the length of the pattern and the string are not equal, return False
        if len(pattern) != len(list_words):
            return False
        
        # Iterate through all the letters and words together, seeing if they align
        for letter, word in zip(pattern, list_words):
            # If the letter is not in the letters map, add it
            if letter not in letters:
                letters[letter] = word

            # If the letter is in the letters map, check if the word is the same
            else:
                if letters[letter] != word:
                    return False

            # If the word is not in the words map, add it
            if word not in words:
                words[word] = letter

            # If the word is in the words map, check if the letter is the same
            else:
                if words[word] != letter:
                    return False
        
        # Return True if the pattern and the string match
        return True

        
if __name__ == "__main__":
    pattern = "abba"
    s = "dog dog dog dog"
    print(Solution().wordPattern(pattern, s))
        