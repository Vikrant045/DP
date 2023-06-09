public class WildCard_Matching{

	public static boolean isMatch(String st1 ,String st2){
      
      int n = st1.length(); int m= st2.length();
      boolean dp[][]= new boolean[n+1][m+1];

      dp[0][0]=true;
      for(int i=1;i<n+1;i++){
      	dp[i][0]= false;
      }
      for(int j=1;j<m+1;j++){
      	if(st2.charAt(j-1)=='*')
      	dp[0][j]= dp[0][j-1];
      }
            for(int i=1;i<n+1;i++){
      for(int j=1;j<m+1;j++){

      	if(st1.charAt(i-1)==st2.charAt(j-1)|| st2.charAt(j-1)=='?'){
      		dp[i][j]= dp[i-1][j-1];
      	}
      	else if(st2.charAt(j-1)=='*'){
      		dp[i][j]= dp[i-1][j]||dp[i][j-1]; 
      	}
      	else{
      		dp[i][j]= false;
      	}
      }
  }

return dp[n][m];
	}

	public static void main(String args[]){

		String st1 ="baaabab";
		String st2 ="*****ba*****ab";
		System.out.println(isMatch(st1,st2));

	}
}