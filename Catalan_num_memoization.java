import java.util.*;
class Catalan_num_memoization{
	public static int cataMemo(int n, int arr[]){

      if(n==0||n==1){
      	return 1;
      }
      if(arr[n]!=-1){
      	return arr[n];
      }
      int ans =0;
      for(int i=0;i<n;i++){
      	ans+= cataMemo(i,arr)*cataMemo(n-i-1,arr);
      
      }
      return arr[n]=ans;
	}
	public static void main(String args[]){
int n=4;
int arr[]= new int[n+1];
Arrays.fill(arr,-1);
	System.out.println(cataMemo(n,arr));
}
}