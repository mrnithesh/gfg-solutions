class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i:arr){
            if (set.contains(i)){
                list.add(i);
            }
            else{
                set.add(i);
            }
        }

        return list;
    }
}