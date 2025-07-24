class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = range(nums, target, true);
        ans[1] = range(nums, target, false);

        return ans;
    }

    public int range(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}