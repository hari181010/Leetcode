class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            digits[i]++;
            if(digits[i]<=9)
            {
                return digits;
            }
            else
            {
                digits[i]=0;
            }
        }
        int re[]=new int[n+1];
        re[0]=1;

        return re;
        
    }
}