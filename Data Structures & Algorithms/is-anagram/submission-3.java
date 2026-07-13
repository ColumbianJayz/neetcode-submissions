class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        
        Arrays.sort(first);
        Arrays.sort(second);

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < t.length(); i++){
            if(first[i]!=second[i]){
                return false;
            }
        }
        return true;





    }
}
