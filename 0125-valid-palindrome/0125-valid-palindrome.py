class Solution:
    def isPalindrome(self, s: str) -> bool:
        h=''.join(i.lower() for i in s if i.isalnum())
        return h==h[::-1]
        