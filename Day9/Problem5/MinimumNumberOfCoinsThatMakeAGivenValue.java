import java.util.*;

public class MinimumNumberOfCoinsThatMakeAGivenValue {
    public static void main(String[] args) {
        int[] coins = {25,10,5};
        int v = 30;
        int ans = miniumCoins(coins, v);
        System.out.println(ans);
    }

    private static int miniumCoins(int[] coins, int v){
        int n = coins.length;
        if(v == 0) return 0;

        int res = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(coins[i] <= v){
                int sub_res = miniumCoins(coins, v-coins[i]);
                if(sub_res != Integer.MAX_VALUE && sub_res + 1 < res){
                    res = sub_res + 1;
                }
            }
        }
        return res;
    }
}
