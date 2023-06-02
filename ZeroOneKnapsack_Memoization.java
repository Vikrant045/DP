public class ZeroOneKnapsack_Memoization {
    
    public static int knapsack(int val[],int wt[],int capacity,int dp[][],int n){
        if(capacity==0||n==0){
            return 0;
        }
        if(dp[n][capacity]!=-1){
            return dp[n][capacity];
        }
        if(wt[n-1]<=capacity){
            //include
            int ans1 = val[n-1]+knapsack(val, wt, capacity-wt[n-1], dp, n-1);
            //exclude
            int ans2 = knapsack(val, wt, capacity, dp, n-1);

            dp[n][capacity]= Math.max(ans1, ans2);
            return dp[n][capacity];
        }
        else{
            dp[n][capacity]= knapsack(val, wt, capacity, dp, n-1);
            return   dp[n][capacity];
        }
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int capacity=7;
        int dp[][]= new int[val.length+1][capacity+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsack(val, wt, capacity, dp, val.length));
    }
}
