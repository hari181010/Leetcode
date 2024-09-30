class Solution {
    boolean count(int num){
        if(num==0) return true;
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        return c%2==0;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int n:nums){
            if(count(n)){
                c++;
            }
        }
        return c;
        
    }
}