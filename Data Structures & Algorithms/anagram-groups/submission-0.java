class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String currS = strs[i];
            char[] currC = currS.toCharArray();
            Arrays.sort(currC);

            map.computeIfAbsent(new String(currC), k -> new ArrayList<>()).add(strs[i]);


        }
        return new ArrayList(map.values());
    }
}
