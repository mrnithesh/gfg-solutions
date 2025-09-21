// User function Template for Java

class Sol {
    int getCount(String S, int N) {
        // your code here
        int[] count = new int[256];
        int i = 0;
        
        while (i < S.length()) {
            char ch = S.charAt(i);
            count[ch]++;
            
            while (i + 1 < S.length() && S.charAt(i + 1) == ch) {
                i++;
            }
            i++;
        }
        int res = 0;
        for (int c : count){
            if (c == N){
                res++;
            }
        }
        return res;
    }
}