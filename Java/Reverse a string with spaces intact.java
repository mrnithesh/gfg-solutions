// User function Template for Java
class Solution {
    String reverseWithSpacesIntact(String S) {
        // your code here
        int l =0;
        int r = S.length()-1;
        char[] arr= S.toCharArray();
        while (l<=r){
            if (arr[l] ==' '){
                l++;
            }
            else if(arr[r]==' '){
                r--;
            }
            else{
                char temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                r--;
            }
        }
        String res = new String(arr);
        return res;
    }
}