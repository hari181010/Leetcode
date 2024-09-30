class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        c=len(nums)
        for i in range(c):
            for j in range(i+1,c):
                if nums[i]+nums[j]==target:
                    return [i,j]
        
                    
        