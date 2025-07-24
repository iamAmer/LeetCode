class Solution {
    int steps = 0;
    public int numberOfSteps(int num) {
        if(num == 0) {
            return steps;
        }

        if(num % 2 == 0) {
            num /= 2;
            steps++;
        } else {
            num--;
            steps++;
        }
        return numberOfSteps(num);
    }
}