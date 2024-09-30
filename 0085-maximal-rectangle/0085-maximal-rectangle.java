class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int h[]=new int[matrix[0].length];
        int lar=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int val=matrix[i][j]-'0';
                if(val==0){
                    h[j]=0;
                }
                else{
                    h[j]+=val;
                }
            }
            int maxa=larg(h);
            if(lar<maxa){
                lar=maxa;
            }
        }
        return lar;
        
    }

    public int larg(int [] h){
        int s[]=new int[h.length];
        int idx=-1;
        int max=0;
        int n=h.length;
        for(int i=0;i<n;i++){
            while(idx!=-1 && h[s[idx]]>h[i]){
                int he=h[s[idx--]];
                int ps=(idx==-1)?-1:s[idx];
                int w=i-ps-1;

                max=Math.max(max,(he*w));

            }
                s[++idx]=i;
            
        }
        while(idx!=-1){
            int he=h[s[idx--]];
            int ps=(idx==-1)?-1:s[idx];
            int w=n-ps-1;
            max=Math.max(max,(he*w));
        }
        return max;
    }
}