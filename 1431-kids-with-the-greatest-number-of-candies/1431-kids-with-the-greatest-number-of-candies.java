class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int curr = candies[i] + extraCandies;

            boolean flag = true;
            for (int j = 0; j < candies.length; j++) {
                if (j == i) {
                    continue;
                }

                if(candies[j] > curr){
                    answer.add(false);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer.add(true);
            }
        }

        return answer;
    }
}