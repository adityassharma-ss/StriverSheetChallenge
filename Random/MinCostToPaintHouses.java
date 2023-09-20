public class MinCostToPaintHouses {
    public static int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        
        int n = costs.length;
        int[][] dp = new int[n][3]; // dp[i][j] represents the minimum cost to paint house i with color j
        
        // Initialize the first row of dp with the costs of the first house
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];
        
        // Start filling the dp table from the second house onwards
        for (int i = 1; i < n; i++) {
            dp[i][0] = costs[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = costs[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = costs[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        
        // Find the minimum cost among the last row of dp
        return Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);
    }

    public static void main(String[] args) {
        int[][] cost = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        int minCost = minCost(cost);
        System.out.println("Minimum cost to paint houses: " + minCost);
    }
}
