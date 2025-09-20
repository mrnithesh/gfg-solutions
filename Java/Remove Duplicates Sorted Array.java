class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int last = arr[0];
        list.add(last);
        for (int i:arr){
            if (i != last){
                list.add(i);
                last = i;
            }
        }
        return list;
    }
}
