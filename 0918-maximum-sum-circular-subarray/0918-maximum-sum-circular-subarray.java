class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int currMax= 0, maxSum= Integer.MIN_VALUE;
        int currMin=0, minSum= Integer.MAX_VALUE;
        
        for (int x: nums){
            currMax= Math.max(x, currMax+x);
            maxSum= Math.max(currMax, maxSum);

            currMin= Math.min(x, currMin+x);
            minSum= Math.min(currMin, minSum);

            total += x;
        }
        if(maxSum <0) return maxSum;
        return Math.max(maxSum, total-minSum);
    }
}