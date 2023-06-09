import java.util.*;
class Tribonacci{
	public static int tribonaaci_rec(int n){
if(n==0||n==1){
	return n;
}
if(n<0){
	return 0;
}

return tribonaaci_rec(n-3)+tribonaaci_rec(n-2)+tribonaaci_rec(n-1);
	}
	public static int tribonaaci_memo(int n,int dp[]){             //MEMOIZATION
if(n==0||n==1){
	return n;
}
if(n<0){
	return 0;
}
if(dp[n]!=-1){
	 return dp[n];
}

 dp[n]=tribonaaci_memo(n-3,dp)+tribonaaci_memo(n-2,dp)+tribonaaci_memo(n-1,dp);
 return dp[n];
	}

	public static int tribonaaci_tabu(int n){             //TABULATION
       int dp []= new int [n+1];
       dp[0]=0;
       dp[1]=1;
       for(int i=2;i<=n;i++){
       	if(i==2){
       		dp[i]= dp[i-2]+dp[i-1];
       	}
       	else{
       	dp[i]= dp[i-3]+dp[i-2]+dp[i-1];
       }
       }
       return dp[n];
	}

	public static void main (String args[]){

	int n = 5  ;
	int dp []= new int [n+1];
	Arrays.fill(dp,-1);
    System.out.println( tribonaaci_rec( n));
        System.out.println( tribonaaci_memo(n,dp));
          System.out.println( tribonaaci_tabu(n));



	}
}