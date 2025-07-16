class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();

            for (int j = 0; j < grid.length; j++) {
                num1.append(grid[i][j]).append(" ");
                num2.append(grid[j][i]).append(" ");
            }

            map1.put(num1.toString(), map1.getOrDefault(num1.toString(), 0) + 1);
            map2.put(num2.toString(), map2.getOrDefault(num2.toString(), 0) + 1);
        }

        int count = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                count += map1.get(key) * map2.get(key);
            }
        }

        return count;
    }
}