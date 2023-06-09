 class String_ConversionLCS{

 	public static int count(String st1,String st2){
 		int n=st1.length();
 		int m= st2.length();
 		int dp[][]= new int [n+1][m+1];
 		for (int i=0;i<n+1 ;i++ ) {
 			for (int j=0;j<m+1 ;j++ ) {
 				if(i==0||j==0){
 					dp[i][j]=0;
 				}
 			}
 		}
 		for (int i=1;i<n+1 ;i++ ) {
 			for (int j=1;j<m+1 ;j++ ) {
 				if(st1.charAt(i-1)==st2.charAt(j-1)){
 					dp[i][j]=dp[i-1][j-1]+1;
 				}
 				else{
 					int ans1= dp[i-1][j];
 					int ans2 = dp[i][j-1];
 					dp[i][j]= Math.max(ans1,ans2);
 				}
 			}
 		}
 		int lcs = dp[n][m];
 		int insertion= m-lcs;
 		int deletion = n-lcs;
 		return insertion+deletion;
 	}

	public static void main(String args[]){
		String st1="abcdef";
		String st2="aceg";
		System.out.println(count(st1,st2));
	}
}