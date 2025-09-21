class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder res = new StringBuilder();
        char[] arr = s.toCharArray();
        int start =0;
        int end=arr.length-1;
        
        while (start<=end && arr[start]==' '){
            start++;
        }
        while (end>=0 && arr[end]==' '){
            end--;
        }
        
        int l=start;
        for(int r = start;r<=end;r++){
            if (r==end || arr[r]==' '){
               int wordEnd = (r==end? r:r-1);
            
                for(int i=wordEnd;i>=l;i--){
                    res.append(arr[i]);
                }
                if (r!=end) res.append(' ');
                
                l=r+1;
                while(l<=end && arr[l]==' '){
                    l++;
                    r=l-1;
                }
            }
            
            
        }
        
        return res.toString();
    }
}
