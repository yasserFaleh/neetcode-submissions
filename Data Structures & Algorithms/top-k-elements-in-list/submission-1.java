class Solution {


    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        List<Integer>[] freq = new List[nums.length];
        for (int i=0; i<nums.length; i++){
            freq[i] = new ArrayList<>();
        }

        count.forEach((key,v) -> freq[v-1].add(key));
        
        int [] res = new int[k];
        int index = 0;
        for ( int i = nums.length - 1; i >= 0; i--){
            for ( int n : freq[i]){
                res[index] = n;
                index++;
                if (index == k)
                    return res;
            }
        }

        
        return res;
    }
}
