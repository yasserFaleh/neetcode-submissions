class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> counter = new HashSet<>();
        for (int a : nums) {
            if (counter.contains(a))
                return true;
            else
                counter.add(a);
        }
        return false;
    }
    
}