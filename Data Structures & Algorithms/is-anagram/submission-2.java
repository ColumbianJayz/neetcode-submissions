class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        if(arrayT.length != arrayS.length){
            return false;
        }
        for(int i = 0; i < arrayS.length; i++){
            if(arrayS[i] != arrayT[i]){
                return false;
            }
            
        }
        return true;



       

    }
}
