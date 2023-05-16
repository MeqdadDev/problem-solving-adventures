# Time Complexity: O(n)

class Solution:
    def isValid(self, s: str) -> bool:
        close = {
            ')': '(',
            '}': '{',
            ']': '['}
        p_stack = list()
        for pr in s:
            if pr in close:
                if len(p_stack) != 0 and p_stack[-1] == close[pr]:
                    p_stack.pop()
                else:
                    return False
            else:
                p_stack.append(pr)
        return True if len(p_stack) == 0 else False
