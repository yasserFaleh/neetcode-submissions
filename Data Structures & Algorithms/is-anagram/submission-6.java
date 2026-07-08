class Solution {

    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (int i=0; i < s.length(); i++){
            count[s.charAt(i)%26]++;
        }
        for (int i=0; i < t.length(); i++){
            count[t.charAt(i)%26]--;
        }
        return Arrays.stream(count).allMatch(n -> n ==0 );
    }
}
