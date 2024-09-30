class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        a=[]
        for char in range(ord('a'),ord('z')+1):
            char=chr(char)
            mc=float('inf')

            for w in words:
                c=w.count(char)
                mc=min(mc,c)
                if mc==0:
                    break
            a.extend([char]*mc)
        return a
        