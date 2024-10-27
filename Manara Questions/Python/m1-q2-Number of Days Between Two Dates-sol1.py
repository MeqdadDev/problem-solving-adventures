# LeetCode - 1360 - Number of Days Between Two Dates
# Module 2 - Question 2

from datetime import datetime


class Solution(object):
    def daysBetweenDates(self, date1, date2):
        """
        :type date1: str
        :type date2: str
        :rtype: int
        """
        firstDate = datetime.strptime(date1, "%Y-%m-%d")
        secondDate = datetime.strptime(date2, "%Y-%m-%d")

        return abs((secondDate - firstDate).days)
