class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> counter = new HashSet<>();
        for (int a : nums) {
            if(!counter.add(a))
                return true;
        }
        return false;
    }
    
}