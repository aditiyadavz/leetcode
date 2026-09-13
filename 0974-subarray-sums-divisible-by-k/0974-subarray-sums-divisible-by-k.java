class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        // Remainder 0 exists before the array starts
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;
            // Java can produce negative remainder
            if (remainder < 0) {
                remainder += k;
            }
            // Every previous same remainder forms a valid subarray
            count += map.getOrDefault(remainder, 0);
            // Store this remainder
            map.put(
                remainder,
                map.getOrDefault(remainder, 0) + 1
            );
        }
        return count;
    }
}