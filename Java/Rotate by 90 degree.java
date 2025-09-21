// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        //transpose
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //reverse each row
        for(int i=0;i<mat.length;i++){
            int left =0;
            int right=mat.length-1;
            while(left<=right){
                int temp = mat[i][right];
                mat[i][right]=mat[i][left];
                mat[i][left]=temp;
                left++;
                right--;
            }
        }
    }
}