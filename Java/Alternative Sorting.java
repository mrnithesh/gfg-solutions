// User function Template for Java

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);  // O(n log n)
        int n = arr.length;

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = n - 1;
        while (i <= j) {
            if (i != j) {
                res.add(arr[j--]); 
                res.add(arr[i++]); 
            } else {
                res.add(arr[i]);   
                break;
            }
        }
        return res;
    }
}
