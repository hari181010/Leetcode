class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxa=0;
        while(l<r)
        {
            int minh=Math.min(height[l],height[r]);
            int w=r-l;
            int a=minh*w;
            maxa=Math.max(maxa,a);

            if(height[l]<height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return maxa;
     
        
    }
}