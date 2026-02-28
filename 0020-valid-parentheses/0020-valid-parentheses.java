class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack <>();

        for(char ch :s.toCharArray()){
            if(isOpen(ch)){
                stack.push(ch);
            }

            else{
                if(stack.isEmpty())
                return false;

                char element = stack.pop();
                boolean result = isPair(element, ch);

                if(result == false){
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

    public boolean isPair(char ch1 , char ch2){
        return(ch1 == '(' && ch2 == ')') || (ch1 == '['&& ch2 ==']') || (ch1=='{' && ch2 =='}'); 
    }

    public boolean isOpen (char ch){
        return ch == '(' || ch == '{'|| ch == '[';
    }
}