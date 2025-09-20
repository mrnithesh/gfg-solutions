/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        
        int l = 0;
        int r = b.length-1;
        int res =b.length;
        while (l<=r){
            int mid = (l+r)/2;
            if (a[mid]== b[mid]){
                l = mid+1;
            }
            else{
                res=mid;
                r = mid-1;
            }
        }
        return res;
    }
}