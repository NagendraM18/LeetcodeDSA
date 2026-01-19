public class NextPermutation
 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            reverse2(nums, 0);
            return;
        }
        for(int i=n-1;i>index;i--)
        {
            if(nums[i]>nums[index])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }

        reverse2(nums, index+1);
        System.out.println(" ");
   
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
    }
     public  static void reverse2(int[] nums,int start)
        {
        int n=nums.length;
        int end=n-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
