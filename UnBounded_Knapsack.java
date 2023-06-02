public class UnBounded_Knapsack {
    
    public static int unBounded_Knapsack(int val[],int wt[],int capacity){
        int n = val.length;
        int dp[][]= new int[n+1][capacity+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]= 0;
        }
        for(int i=0;i<capacity+1;i++){
            dp[0][i]= 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<capacity+1;j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w<=j){
                    dp[i][j]=Math.max(v+dp[i][j-w],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];

                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int capacity=7;
        System.out.println(unBounded_Knapsack(val, wt, capacity));
    }
}
