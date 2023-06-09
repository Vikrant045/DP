public class Edit_Distance {
    
    public static int conversion_Steps(String st1,String st2){

        int n= st1.length();
        int m= st2.length();
        int dp[][]= new int[n+1][m+1];
for(int i=0;i<n+1;i++){
    for(int j=0;j<m+1;j++){
        if(i==0){
            dp[i][j]=j;
        }
        if(j==0){
            dp[i][j]=i;
        }
    }
}
for(int i=1;i<n+1;i++){
    for(int j=1;j<m+1;j++){
        if(st1.charAt(i-1)==st2.charAt(j-1)){
        dp[i][j]= dp[i-1][j-1];
    }
    else{
        dp[i][j]= Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
    }
}

    }
    return dp[n][m];
}
    public static void main(String args[]){
        String st1="intention";
        String st2 ="execution";
        System.out.println(conversion_Steps(st1, st2));
    }
}
