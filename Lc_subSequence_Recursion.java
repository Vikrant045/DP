public class Lc_subSequence_Recursion {
    
    public static int lcs ( String st1, String st2,int n,int m){

        if(n==0||m==0){
            return 0;
        }
        if(st1.charAt(n-1)==st2.charAt(m-1)){
            return lcs(st1, st2, n-1, m-1)+1;
        }
        else{
            int ans1 = lcs(st1, st2, n-1, m);
            int ans2 = lcs(st1, st2, n, m-1);
              return Math.max(ans1,ans2);
        }
    }

    public static void main(String args[]){
        String st1 ="adcde";
        String st2 ="ace"; 
        System.out.println(lcs(st1, st2, st1.length(), st2.length()));   
    }
}
