class Solution {
    private void put(char c, Map<Character, Integer> count){
        count.put(c, count.containsKey(c) ? count.get(c) + 1 : 1);
    }
    private boolean remove(char c, Map<Character, Integer> count){
        if (!count.containsKey(c) || count.get(c) < 1 )
            return false;
        count.put(c, count.get(c) - 1);
        return true;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            put(s.charAt(i), count);
        }
        for (int i = 0; i < t.length(); i++){
            if(!remove(t.charAt(i), count))
                return false;
        }

        return count.values().stream().mapToInt(Integer::valueOf).sum() == 0;

    }
}
