class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int rev=0;
        int reversed=x;
        while(reversed>0)
        {
            rev=rev*10+reversed%10;
            reversed/=10;
        }
        return x==rev;
        
    }
}