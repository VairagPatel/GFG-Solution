class Solution {
    public int maxSubstring(String S) {
        int n = S.length();
        if (n == 0) return 0;
        int[] t = new int[n];

        // Initialize the first element
        if (S.charAt(0) == '1') {
            t[0] = -1;
        } else {
            t[0] = 1;
        }

        // Fill the array according to the logic
        for (int i = 1; i < n; i++) {
            if (S.charAt(i) == '1' && t[i - 1] == -1) {
                t[i] = -1;
            } else if (S.charAt(i) == '1' && t[i - 1] != -1) {
                t[i] = t[i - 1] - 1;
            } else {
                t[i] = 1 + Math.max(t[i - 1], t[i]);
            }
        }

        // Find the maximum element in t[]
        int max = t[0];
        for (int i = 1; i < n; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }
}
