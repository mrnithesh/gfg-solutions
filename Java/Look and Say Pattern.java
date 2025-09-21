class Solution {
    public String countAndSay(int n) {
        // code here
        if (n==1){
            return "1";
        }
        String currTerm ="1";
        for (int i=2;i<=n;i++){
            StringBuilder nextTerm = new StringBuilder();
            int j =0;
            while(j<currTerm.length()){
                char currDigit = currTerm.charAt(j);
                int count=0;
                while(j<currTerm.length() && currTerm.charAt(j)==currDigit){
                    count+=1;
                    j++;
                }
                nextTerm.append(count);
                nextTerm.append(currDigit);
            }
            currTerm = nextTerm.toString();
        }
        return currTerm;
    }
}
