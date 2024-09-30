class Solution:
    def reverseVowels(self, s: str) -> str:
        n=len(s)-1
        ss=list(s)
        vowels=['a','e','i','o','u','A','E','I','O','U']
        i=0
        j=n
        while(i<=j):
            if(ss[i] in vowels and ss[j] in vowels):
                ss[i],ss[j]=ss[j],ss[i]
                i+=1
                j-=1
            elif ss[i] in vowels and ss[j] not in vowels:
                j-=1
            elif ss[i] not in vowels and ss[j] in vowels:
                i+=1
            else:
                i+=1
                j-=1
        return "".join(ss)


        


        