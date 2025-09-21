class Solution {
    public static String encode(String s) {
        StringBuilder encodedString = new StringBuilder();
        int n = s.length();
        int i = 0;
        
        while (i < n) {
            char currentChar = s.charAt(i);
            int count = 1;
            
            while (i + 1 < n && s.charAt(i + 1) == currentChar) {
                i++;
                count++;
            }
            
            // Append the character and its count
            encodedString.append(currentChar);
            encodedString.append(count);
            
            i++;
        }
        
        return encodedString.toString();
    }
}
