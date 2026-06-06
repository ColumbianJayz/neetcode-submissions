class Solution {
    //we need a isAnagram as a boolean. so a separate function that we'll use within this one. 
    //the part where we might struggle is how to add into sublists once found and iterating. 
    
   public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (int i = 0; i < strs.length; i++) {
        char[] word = strs[i].toCharArray();
        Arrays.sort(word);
        String key = Arrays.toString(word);

        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(strs[i]);
    }

    return new ArrayList<>(map.values());
}
    
   
}
