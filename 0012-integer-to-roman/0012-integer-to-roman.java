class Solution {
    public String intToRoman(int num) {
        int[] ic={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] c={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ic.length;i++){
            while(num>=ic[i]){
                sb.append(c[i]);
                num-=ic[i];
            }
        }
        return sb.toString();
        
    }
}