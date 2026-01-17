class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int column=matrix[0].length;
        int row=matrix.length;
        int firstcolumn=1;

        for(int i=0;i<row;i++)
        {
            if(matrix[0][0]==0)
            {
                firstcolumn=0;
            }
            for(int j=1;j<column;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<column;j++)
            {
                if(matrix[i][j]!=0)
                {
                    if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    {
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0)
        {
            for(int j=0;j<column;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(firstcolumn==0)
        {
            for(int i=0;i<row;i++)
            {
                matrix[i][0]=0;
            }
        }
    
    }  
}