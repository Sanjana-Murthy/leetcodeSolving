class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            //sort, signature, bucket
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedS = new String(charArr);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
