public class pascalTriangleDSA
{
    public static void main(String[] arg)
    {
        int r=4;
        int c=2;
        int n=r;
        for(int i=0;i<=n;i++)
        {
          for(int j=0;j<=i;j++)
          {
            System.out.print(value1(i,j));
          }
          System.out.println();
        }
       System.out.println("output "+value1(r,c));
    }
    public static int value1(int r, int c){
         int ans=1;
         for(int i=0;i<c;i++){
         ans=ans*(r-i);
         ans=ans/(i+1);
       }
       return ans;
    }
 
  }