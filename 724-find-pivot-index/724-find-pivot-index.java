class Solution {
    public int pivotIndex(int[] nums) {
         int leftSum=0;
        int rightSum=0;
    
    for(int i=1;i<nums.length;i++)
        rightSum += nums[i];
    if(leftSum== rightSum)
        return 0;
    for(int i=1; i< nums.length;i++)
    {
        leftSum = leftSum +nums[i-1];
        rightSum=rightSum - nums[i];
        
        if(leftSum== rightSum)
            return i;
    }
    
    return -1;
    
}
}