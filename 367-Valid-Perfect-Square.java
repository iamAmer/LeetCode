class Solution {
    public boolean isPerfectSquare(int num) {
        int square = mySqrt(num);
        if(square*square == num) {
            return true;
        } else {
            return false;
        }
    }

    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int result = 0;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if((long)mid*mid > x) {
                end = mid - 1;
            } else if((long)mid*mid < x) {
                result = mid;
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return result;
    }
}