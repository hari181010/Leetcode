class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        l=[]
        if nums1==nums2:
            return nums1
        n=len(nums2)-1
        i=0
        nums1=list(set(nums1))
        for i in nums2:
            if i in nums1:
                l.append(i)
                nums1.remove(i)
            i+=1
        return l

        