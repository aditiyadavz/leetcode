class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;
        int totalSum = 0;
        for (int point : cardPoints) {
            totalSum += point;
        }
        // If k == n, we must take all cards
        if (windowSize == 0) {
            return totalSum;
        }
        // Calculate the sum of the first window of size (n - k)
        int currentWindowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += cardPoints[i];
        }
        int minWindowSum = currentWindowSum;
        // Slide the window across the array
        for (int i = windowSize; i < n; i++) {
            currentWindowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, currentWindowSum);
        }
        return totalSum - minWindowSum;
    }
}