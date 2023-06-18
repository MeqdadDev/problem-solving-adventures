class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = 0   # first day
        sell = 1  # second day
        max_profit = 0
        while sell < len(prices):
            if prices[buy] < prices[sell]:  # worth it?
                profit = prices[sell] - prices[buy]
                max_profit = max(max_profit, profit)
            else:
                buy = sell
            sell += 1
        return max_profit

# Time Complexity: O(n)
# Memory Complexity: O(1)
