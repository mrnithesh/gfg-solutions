class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int top = 0, bottom= n-1;
        int left = 0, right = m-1;
        ArrayList<Integer> res = new ArrayList<>();
        
        while(top<=bottom && left<=right){
            for (int i=left;i<=right;i++){
                res.add(mat[top][i]);
            }
            top++;
            
            for(int i= top;i<=bottom;i++){
                res.add(mat[i][right]);
            }
            right--;
            
            if(left<=right && top<=bottom){
                for (int i=right;i>=left;i--){
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if (top<=bottom && left <= right){
                for(int i=bottom;i>=top;i--){
                    res.add(mat[i][left]);
                }
                left++;
            }
            
        }
        return res;
    }
}
