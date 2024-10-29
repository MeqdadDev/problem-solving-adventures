# 231. Power of Two

# Module 1 - Question 3


class Solution:
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        power_two = 1
        while power_two <= n:
            if power_two == n:
                return True
            power_two *= 2
        return False
