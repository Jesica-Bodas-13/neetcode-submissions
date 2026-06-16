class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> anagramListMap = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> anagramMap = new HashMap<>();
            char[] charArray = strs[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                anagramMap.put(charArray[j], anagramMap.getOrDefault(charArray[j], 0) + 1);
            }
            
            anagramListMap.computeIfAbsent(anagramMap, k -> new ArrayList<>()).add(strs[i]);
        }
        
        return new ArrayList<>(anagramListMap.values());
    }
}