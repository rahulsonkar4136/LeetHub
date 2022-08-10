class Solution {
    public int[] runningSum(int[] nums) {
        int add = 0;
        
        int ans[]  = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i] + add;
            add = ans[i];
        }
        return ans;
    }
}
  