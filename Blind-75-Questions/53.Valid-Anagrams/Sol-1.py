class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        lst_t = list(t)

        for ltr in s:
            if ltr in lst_t:
                lst_t.remove(ltr)
            else:
                return False
        return True
