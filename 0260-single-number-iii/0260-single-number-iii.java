class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2) return nums;
        
        HashMap<Integer,Integer> hm=new HashMap();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int count=0;
        for (int value : hm.values()) {
            if (value == 1) {
                count++;
            }
        }
        int []ar=new int[count];
        int i=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                ar[i] = entry.getKey();
                i++;
            }
        }
        return ar;
    }
}