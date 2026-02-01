class Solution
{
    public void maxslidingwindow(int[] array,int k)
    {
      int storingvalue=0;
      int Maxsum=Integer.MIN_VALUE;
      int left=0;
      for(int i=0;i<array.length;i++)
      {
        storingvalue +=array[i];
        if(i>=k-1)
        {
            Masum = Math.max(Maxsum,storingvalue);
          
        }

      }

    }
}
public class SlidingWindow
{
    public static void main(String[] arg){

    int[] array1={1,3,-1,-3,5,3,6,7};
    Solution obj=new Solution();
    int  k=3;
    obj.maxslidingwindow(array1,k);

    
    }
}