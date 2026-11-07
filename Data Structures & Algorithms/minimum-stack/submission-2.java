class MinStack {
    private Stack<Integer>  stack;
    private Stack<Integer> miniStack;

    public MinStack() {
        stack = new Stack<>();
        miniStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(miniStack.isEmpty() || val <= miniStack.peek()){
            miniStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top == miniStack.peek()){
            miniStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return miniStack.peek();
        
    }
}
