class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        long value = 1;
        for (int r = 1; r <= rowIndex; r++) {
            value = value * (rowIndex - r + 1) / r;
            row.add((int) value);
        }
        return row;
    }
}