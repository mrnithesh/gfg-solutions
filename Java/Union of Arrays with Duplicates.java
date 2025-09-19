class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set = new HashSet<>();
        for (int i:a) set.add(i);
        for (int i:b) set.add(i);
        ArrayList<Integer> res= new ArrayList<>(set);
        return res;
    }
}