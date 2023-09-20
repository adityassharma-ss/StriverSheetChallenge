public class MinOperationsToReduceToZero {
    public static int minOperations(int n) {
        int[] dp = new int[32];
        dp[0] = 0;

        for (int i = 1; i <= 31; i++) {
            int currentBit = (n >> (i - 1)) & 1;

            if (currentBit == 0) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + 1;

                if (i >= 2 && ((n >> (i - 2)) & 1) == 1) {
                    dp[i] = Math.min(dp[i], dp[i - 2]);
                }
            }
        }

        return dp[31];
    }

    public static void main(String[] args) {
        int n = 10; // Change this to your input number
        int minOps = minOperations(n);
        System.out.println("Minimum operations to reduce " + n + " to 0: " + minOps);
    }
}
