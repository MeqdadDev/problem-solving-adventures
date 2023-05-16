# Time Complexity: O(n)

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        accumulator = {}
        for i in range(len(nums)):
            gap = target - nums[i]
            if gap in accumulator:
                return[i, accumulator[gap]]
            accumulator[nums[i]] = i