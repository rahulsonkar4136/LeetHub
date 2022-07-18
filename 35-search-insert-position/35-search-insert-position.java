class Solution {
    public int searchInsert(int[] nums, int target) {
            int temp=0;
        
        int len=nums.length-1;
        int last=nums[len];
        if(target>last)
        {
            return nums.length;
        }
        
        
        while(nums[temp]<target)
        {
            temp++;
        }
        
        return temp;
        
 
    }
}