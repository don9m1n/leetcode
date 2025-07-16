class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rowMap = new HashMap<>();
        Map<List<Integer>, Integer> colMap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> col = new ArrayList<>();

            for (int j = 0; j < grid.length; j++) {
                row.add(grid[i][j]);
                col.add(grid[j][i]);
            }

            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
            colMap.put(col, colMap.getOrDefault(col, 0) + 1);
        }

        int pair = 0;
        for (List<Integer> key : rowMap.keySet()) {
            if (colMap.containsKey(key)) {
                pair += rowMap.get(key) * colMap.get(key);
            }
        }

        return pair;
    }
}