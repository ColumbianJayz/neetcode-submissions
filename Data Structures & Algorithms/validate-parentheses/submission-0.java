class Solution {
    public boolean isValid(String s) {
        char[] thing = s.toCharArray();
        Map<Character, Character> hashMap = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        hashMap.put('(',')');
        hashMap.put('[',']');
        hashMap.put('{','}');

        for(int i = 0; i < thing.length; i++){
            if(thing[i] == '(' || thing[i] == '{' || thing[i] == '['){
                stack.push(thing[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
            
                if(hashMap.get(pop) != thing[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
