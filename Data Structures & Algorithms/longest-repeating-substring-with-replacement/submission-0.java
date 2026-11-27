class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));

            int currentWindow = right - left + 1;
            int replacements = currentWindow - maxFreq;

            if (replacements > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}