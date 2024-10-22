# LeetCode - 1662 - Check If Two String Arrays are Equivalent
# Module 1 - Question 1


class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        """
        :type word1: List[str]
        :type word2: List[str]
        :rtype: bool
        """

        connected_word1 = "".join(word1)
        connected_word2 = "".join(word2)

        return connected_word1 == connected_word2
