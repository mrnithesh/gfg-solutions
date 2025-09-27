// User function Template for Java

class Solution {

    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        helper(res,"",0,0,n/2);
        return res;
    }
    public void helper(List<String> res, String currString, int openCount, int closeCount, int n){
        if (openCount == n && closeCount == n){
            res.add(currString);
            return;
        }
        if (openCount<n){
            helper(res,currString+"(",openCount+1,closeCount,n);
        }
        if (closeCount<openCount){
            helper(res,currString+")",openCount,closeCount+1,n);
        }
    }
}

