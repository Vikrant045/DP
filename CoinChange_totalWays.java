public class CoinChange_totalWays {
    
    public static int countWays(int coins[],int sum){
        int dp[][]= new int[coins.length+1][sum+1];
        for(int i=0;i<coins.length+1;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<sum+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<coins.length+1;i++){
        for(int j=1;j<sum+1;j++){
              if(coins[i-1]<=j){
                dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
              }
              else{
                dp[i][j]=dp[i-1][j];
              }
        }
        }
       return dp[coins.length][sum];
    }
    public static void main(String args[]){
        int coins[]={2,5,3,6};
        int sum=10;
        System.out.println(countWays(coins, sum));
    }
}
