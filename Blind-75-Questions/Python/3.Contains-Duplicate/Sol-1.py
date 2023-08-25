class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        unique_numbers = set(nums)
        if len(unique_numbers) != len(nums):
            return True
        else:
            return False
