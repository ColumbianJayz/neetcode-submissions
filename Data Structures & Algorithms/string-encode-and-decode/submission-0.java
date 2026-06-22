class Solution {

    public String encode(List<String> strs) {
        //I want to iterate through this list
        //Initiliaze a strign that I will return 
        //Concat each item to the end of the string as I iterate over. 
        String word = "";
        for(int i = 0; i < strs.size(); i++){
            //we need the length of each word
            String size = strs.get(i).length() + "#";
            String string = strs.get(i);
            word = word + size + string;
        }
        return word;

    }

    public List<String> decode(String str) {
    //Now for decoding i have to look for #
    List<String> result = new ArrayList<>();
    int i = 0; 
    while (i < str.length()){
        int hashIndex = str.indexOf('#', i);
        int length = Integer.parseInt(str.substring(i, hashIndex));
        String word = str.substring(hashIndex + 1, hashIndex + 1 + length);
        result.add(word);
        i = hashIndex + 1 + length;
    }
    return result;



    }
}
