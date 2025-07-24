class Solution {
    public int singleNonDuplicate(int[] nums) {
        // only one element
        if(nums.length == 1) {
            return nums[0];
        }
        // first element
        if(nums[0] < nums[1]) {
            return nums[0];
        }
        // last element
        else if(nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while(start <= end) {
            mid = start + (end - start)/2;

            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if(nums[mid] == nums[mid + 1]) {
                if(mid % 2 == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if(nums[mid] == nums[mid - 1]) {
                if(mid % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return nums[mid];
    }
}