public class LC_SubString_Tabu {
    
    public static int lc_subString( String st1, String st2){
        int ans=0;
        int dp[][]=new int [st1.length()+1][st2.length()+1];
for(int i=0;i<dp.length;i++){
    for(int j=0;j<dp[0].length;j++){
        if(i==0||j==0){
            dp[i][j]=0;
        }
    }
}
for(int i=1;i<dp.length;i++){
    for(int j=1;j<dp[0].length;j++){
        if(st1.charAt(i-1)==st2.charAt(j-1)){
            dp[i][j]=dp[i-1][j-1]+1;
            ans= Math.max(dp[i][j],ans);
        }
        else{
       dp[i][j]=0;
        }
    }
}

return ans;

    }
    public static void main(String args[]){
        String st1="ABCDE";
        String st2="ABGCE";
        System.out.println(lc_subString(st1, st2));
    }
}
