public class ZeroOneKnapsack_Recursion {
    public static int knapsack(int val[],int wt[],int capacity,int n){
        if(capacity==0||n==0){
            return 0;
        }
        if(wt[n-1]<=capacity){
            //include
            int ans1= val[n-1]+knapsack(val, wt, capacity-wt[n-1], n-1);
            //exclude
            int ans2= knapsack(val, wt, capacity, n-1);
         return Math.max(ans1, ans2);
        }
        else{
         return   knapsack(val, wt, capacity, n-1);
        }
    }
    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int capacity=7;
        System.out.println(knapsack(val, wt, capacity, val.length));
    }
}
