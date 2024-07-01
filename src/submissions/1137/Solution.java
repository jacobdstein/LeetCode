class Solution {
    public int tribonacci(int n) {
        int[] preceding = new int[] {0, 1, 1};
        
        if (n < 3) {
            return preceding[n];
        }

        for (int i = 3; i < n + 1; i++) {
            preceding[i % 3] = preceding[0] + preceding[1] + preceding[2];
        }

        return preceding[n % 3];
    }
}

