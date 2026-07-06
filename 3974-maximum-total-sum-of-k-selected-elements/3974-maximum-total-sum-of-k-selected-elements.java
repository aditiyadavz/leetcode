class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            long currentMul = Math.max(1, mul - i);
            long element = nums[n - 1 - i];
            totalSum += element * currentMul;
        }
        return totalSum;
    }
}