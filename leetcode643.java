public class leetcode643
{
    public double findMaxAverage(int[] nums, int k) 
    {
        int left=0;
        double maxsum=Integer.MIN_VALUE;
        double storingvalue=0.0;
        for(int i=0;i<nums.length;i++)
        {
            storingvalue += nums[i];
            if(i >= k-1){
            maxsum=Math.max(maxsum,storingvalue);
            storingvalue -= nums[left];
            left += 1;
            }
        }

        return maxsum/k;   
    }
} 
    
