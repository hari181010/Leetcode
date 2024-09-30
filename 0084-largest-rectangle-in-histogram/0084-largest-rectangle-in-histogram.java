class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int maxa=0;
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<=n;i++){
            int curr=i==n?0:h[i];

            while(!s.isEmpty() && curr<h[s.peek()]){

                int t=s.pop();
                int w=s.isEmpty()?i:i-s.peek()-1;
                int a=h[t]*w;
                maxa=Math.max(a,maxa);
            }
            s.push(i);
        }
        return maxa;
        
    }
}