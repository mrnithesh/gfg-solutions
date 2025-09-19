class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Set<Integer> set = new HashSet<>(); //diff
        for (int i: arr){
            int diff = target - i;
            if (set.contains(diff)){
                return true;
            }
            else{
                set.add(i);
            }
        }
        return false;
    }
}