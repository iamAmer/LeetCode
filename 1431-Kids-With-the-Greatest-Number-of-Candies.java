class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int kidCandies = candies[i] + extraCandies;
            if(max(candies, kidCandies)) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }

    public boolean max(int[] candies, int kidCandies) {
        for (int i = 0; i < candies.length; i++) {
            if(kidCandies < candies[i]) {
                return false;
            }
        }
        return true;
    }
}