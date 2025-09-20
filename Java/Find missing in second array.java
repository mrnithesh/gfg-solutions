// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : b){
            set.add(i);
        }
        for (int i :a){
            if (!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
