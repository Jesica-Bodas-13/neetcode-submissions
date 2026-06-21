class MinStack {
    Deque<Integer> mainStack = new ArrayDeque<> ();
    Deque<Integer> minStack = new ArrayDeque<> ();
    
    //This is the constructor. 
    public MinStack() {
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            minStack.push(Math.min(minStack.peek(), val));
        }
    }
    
    public void pop() {
        minStack.pop();
        mainStack.pop();
    }
    
    public int top() {
        return (mainStack.peek());
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
