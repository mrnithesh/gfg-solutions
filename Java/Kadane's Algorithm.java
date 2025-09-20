class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i : arr){
            currSum = Math.max(i, currSum+i);
            maxSum  = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
