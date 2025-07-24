class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        if(arr[0] > arr[1]) {
            return 0;
        } else if(arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]) {
                end = mid - 1;
            } else if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}