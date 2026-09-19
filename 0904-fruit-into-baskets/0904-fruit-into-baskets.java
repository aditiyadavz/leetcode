class Solution {
    public int totalFruit(int[] fruits) {
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currentMax = 0;
        int maxFruits = 0;
        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currentMax++;
            } else {
                currentMax = lastFruitCount + 1; // last contiguous sequence of lastFruit + current fruit
            }
            if (fruit == lastFruit) {
                lastFruitCount++;
            } else {
                lastFruitCount = 1;
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            maxFruits = Math.max(maxFruits, currentMax);
        }
        return maxFruits;
    }
}