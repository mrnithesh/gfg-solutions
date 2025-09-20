class Solution {
    public void sortIt(int[] arr) {
        // code here
        int l =0, n= arr.length;
        int oddEnd = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 != 0) { // odd
                int temp = arr[oddEnd];
                arr[oddEnd] = arr[j];
                arr[j] = temp;
                oddEnd++;
            }
        }
        // System.out.print(Arrays.toString(arr));
        Arrays.sort(arr,0,oddEnd);
        reverse(arr,0,oddEnd-1);
        Arrays.sort(arr,oddEnd,arr.length);
    }
    public static void reverse(int[] arr,int l, int r){
        while (l<r){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
    }
}
