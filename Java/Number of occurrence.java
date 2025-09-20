class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int l = 0, r = arr.length-1;
        int count=0;
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid]==target){
                count++;
                int p1 = mid-1;
                int p2= mid+1;
                while (p1>=0 && arr[p1]==target){
                    count++;
                    p1--;
                }
                while (p2<arr.length && arr[p2]==target){
                    count++;
                    p2++;
                }
                break;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return count;
    }
}
