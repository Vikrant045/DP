public class ZeroOneKnapsack_Tabulation {
    public static int knapsack(int val[],int wt[],int capacity){
        int n =val.length;
        int dp[][]= new int [n+1][capacity+1];
        for(int i=0;i<dp.length;i++){  //row
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){  //coloumn
            dp[0][1]=0;
        }
        for(int i=1;i<dp.length;i++){  
            for(int j=1;j<dp[0].length;j++){ 
                int v= val[i-1];
                int w= wt[i-1];
                if(w<=j){
                    int includeProfit = v+ dp[i-1][j-w];
                    int excludeProfit = dp[i-1][j];
                    dp[i][j]= Math.max(includeProfit, excludeProfit);
                }
                else{
                    int excludeProfit = dp[i-1][j];
                    dp[i][j]= excludeProfit;

                }
            }

        }
        return dp[n][capacity];
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int capacity=7;
       System.out.println(knapsack(val, wt, capacity));
    }
}
