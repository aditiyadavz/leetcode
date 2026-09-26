class Solution {
    public int minGroups(int[][] intervals) {
         // Sort by starting time
        Arrays.sort(intervals,
            (a, b) -> Integer.compare(a[0], b[0]));
        // Min-heap stores ending times
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            // Reuse a group only if its interval ends
            // strictly before the current interval starts
            if (!pq.isEmpty() && pq.peek() < start) {
                pq.poll();
            }
            // Add the current interval to a group
            pq.offer(end);
        }
        return pq.size();
    }
}