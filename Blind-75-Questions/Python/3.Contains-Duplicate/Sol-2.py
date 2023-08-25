class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashmap = dict()
        for n in nums:
            if n in hashmap:
                return True
            else:
                hashmap[n] = n
        return False
