class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];

        for(int i=0; i< nums.length; i++) {
            counts[nums[i]]++;
        }

        for(int i=1; i<=100; i++) {
            counts[i]+= counts[i-1];
        }

        for(int i=0; i< nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = counts[nums[i] - 1];
            }
        }
        return nums;
    }
}