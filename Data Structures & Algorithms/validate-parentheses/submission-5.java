class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<> ();
        char [] characterArray = s.toCharArray();

        if(characterArray.length == 0){
            return true;
        }else if(characterArray.length == 1){
            return false;
        }else{
            for (char item : characterArray){
                
                if(item == '(' || item == '[' || item == '{'){
                    stack.push(item);
                }else if (!stack.isEmpty() && item == ')' && stack.peek().equals('(')){
                    System.out.print(item + stack.peek());
                    stack.pop();
                }else if (!stack.isEmpty() &&  item == ']' && stack.peek().equals('[')){
                    System.out.print(item + stack.peek());
                    stack.pop();
                }else if (!stack.isEmpty() && item == '}' && stack.peek().equals('{')){
                    System.out.print(item + stack.peek());
                    stack.pop();
                }else{
                    return false;
                }
            
            }

            if(!stack.isEmpty()){
                return false;
            }
            return true;
        }
    }
}
