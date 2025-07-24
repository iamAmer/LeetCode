class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(isEven(nums[i])) {
                count++;
            }
        }
        return count;
    }

    boolean isEven(int number) {
        String s = Integer.toString(number);
        if(s.length() %2 == 0) {
            return true;
        }
        return false;
    }
}