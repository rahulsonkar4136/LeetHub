class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, ArrayList<Integer> perm) {
        if (perm.size() == nums.length) {
            result.add(new ArrayList<>(perm)); 
            return;
        }

        for (int num : nums) {
            if (!perm.contains(num)) {
                perm.add(num);
                backtrack(nums, result, perm);
                perm.remove(perm.size() - 1);
                
                
            }
        }
    }
}