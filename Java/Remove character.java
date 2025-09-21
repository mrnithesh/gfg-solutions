class Solution {
    String removeChars(String str1, String str2) {
        Set<Character> set = new HashSet<>();
        for (char ch : str2.toCharArray()) {
            set.add(ch);
        }

       
        StringBuilder result = new StringBuilder();
        for (char ch : str1.toCharArray()) {
            if (!set.contains(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
