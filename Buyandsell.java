class Solution {
    public int stockBuySell(int[] arr, int n)
    {
     int mini=arr[0];
     int profit=0;
     for(int i=1;i<n;i++)
     {
         int cost=arr[i]-mini;
         profit=Math.max(cost,profit);
         mini=Math.min(arr[i],mini);
     }
     return profit;  
    }
}
class Buyandsell{
    public static void main(String arg[])
    {
        Solution obj=new Solution();
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;
        int result=obj.stockBuySell(arr,n);
        System.out.println(result);
    }
}