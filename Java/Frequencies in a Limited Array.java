class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i:arr){
            int count = hm.getOrDefault(i,0)+1;
            hm.put(i,count);
        }
        // System.out.println(hm);
        int[] res = new int[arr.length];
        for (Map.Entry<Integer,Integer> entry: hm.entrySet()){
            res[entry.getKey()-1] = entry.getValue();
        }
        List<Integer> result = new ArrayList<>();
        for (int i: res){
            result.add(i);
        }
        return result;
        
    }
}
