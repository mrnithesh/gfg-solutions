// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i:nums){
            while(i>0){
                set.add(i%10);
                i = i/10;
            }
        }
        //System.out.println(set);
        int [] res = new int[set.size()];
        int idx = 0;
        for (int digit : set) {
            res[idx++] = digit;
        }

        return res;

    }
}