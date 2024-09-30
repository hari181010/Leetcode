public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Initialize count of subarrays, prefix sum, and hash map for remainders
        int c = 0;
        int pre= 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // To handle subarrays that start from the beginning

        for (int num : nums) {
            // Update prefix sum
            pre =pre+ num;
            
            // Calculate the remainder of the prefix sum divided by k
            int mod = pre % k;
            
            // Adjust negative remainders to be positive
            if (mod < 0) {
                mod += k;
            }
            
            // If this remainder has been seen before, it means there are subarrays ending here that are divisible by k
            if (prefixMap.containsKey(mod)) {
                c += prefixMap.get(mod);
                prefixMap.put(mod, prefixMap.get(mod) + 1);
            } else {
                prefixMap.put(mod, 1);
            }
        }
        
        return c; // Total number of subarrays divisible by k
    }
}