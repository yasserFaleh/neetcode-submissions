class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String curr : strs) {
            
            int[] code = new int[26];
            for (int i = 0; i < curr.length(); i++) {
                code[curr.charAt(i)%26]++;
            }

            map.computeIfAbsent(Arrays.toString(code), k -> new ArrayList<>()).add(curr);

        }
        return new ArrayList(map.values());
    }
}
