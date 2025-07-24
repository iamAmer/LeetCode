class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long res = 1;

        while(start <= end) {
            long mid = start + (end - start)/2;

            if((long)mid*(mid+1)/2 < n) {
                res = mid;
                start = mid + 1;
            } else if((long)mid*(mid+1)/2 > n) {
                end = mid - 1;
            } else {
                return (int)mid;
            }
        }
        return (int)res;
    }
}