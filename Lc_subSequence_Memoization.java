public class Lc_subSequence_Memoization {
    
    public static int lcs(String st1,String st2,int n,int m, int dp[][]){
  if(n==0||m==0)
  {
    return 0;
  }
  if(dp[n][m]!=-1){
    return dp[n][m];
  }
  if(st1.charAt(n-1)==st2.charAt(m-1)){
   return dp[n][m]= lcs(st1, st2, n-1, m-1, dp)+1;
  }
  else{
    int ans1 = lcs(st1, st2, n-1, m, dp);
    int ans2 = lcs(st1, st2, n, m-1, dp);
   return  dp[n][m] = Math.max(ans1,ans2);

  }
 
    }
    public static void main(String args[]){
        String st1 ="abcdge";
        String st2 ="abedg"; 
        int dp[][]= new int [ st1.length()+1][ st2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(lcs(st1, st2, st1.length(), st2.length(),dp)); 
    }
}
