import java.lang.*;
class Solution {
    public int maxSubArray(int[] nums) {
//         int n=nums.length;
//         int max_sum=nums[0];
//         int sum_till_now=0;
//         if(sum_till_now<0)
//         {
//             sum_till_now=0;
//         }
//         else{
//             sum_till_now=nums[0];
//         }
        
//         for(int i=0;i<n;i++){
//             max_sum=Math.max(max_sum, nums[i]+sum_till_now);
//             sum_till_now+=nums[i];
//             if(sum_till_now<0)
//             {
//                 sum_till_now=0;
//             }
//         }
//             return max_sum;
        
        int max = nums[0];
int currentmax = max;

    for(int i=1;i<nums.length;i++){
        currentmax = Math.max(nums[i]+currentmax,nums[i]);
        max = Math.max(currentmax,max);
    }
    
    return max;
    }
}