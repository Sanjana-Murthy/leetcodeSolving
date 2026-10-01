class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sFinal = new HashMap<>();
        HashMap<Character, Integer> tFinal = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            sFinal.put(s.charAt(i), sFinal.getOrDefault(s.charAt(i), 0) + 1);
            tFinal.put(t.charAt(i), tFinal.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sFinal.equals(tFinal);
    }
}
