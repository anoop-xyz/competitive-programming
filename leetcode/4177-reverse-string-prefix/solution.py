class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        rstring=""
        for i in range (k):
            rstring+=s[i]
        rstring=rstring[::-1]
        rstring1=""
        for j in range (k,len(s)):
            rstring1+=s[j]
        final=rstring+rstring1
        return final
   
        
        
