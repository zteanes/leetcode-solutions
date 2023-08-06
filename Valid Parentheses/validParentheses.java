import java.util.Stack;

class Solution {
    public boolean isValid(String s){
        Stack<Character> braces = new Stack<Character>(); // stack for the braces in the string
        
        for(int i = 0; i < s.length(); i++){ // loop and push all braces
            Character curr = s.charAt(i); // get current character

            if(curr == '(' || curr == '[' || curr == '{') // if opening brace, push on stack
                braces.push(curr);
            
            else{
                if(braces.size() == 0) // it's empty, meaning no opening brace
                    return false;
                Character compare = braces.peek();

                if((curr == ')' && compare == '(') // we have a pairing and it matches up
                || (curr == ']' && compare == '[')
                || (curr == '}' && compare == '{')){
                    braces.pop(); // remove from the stack
                }
                else // no match means error
                    return false;
            }
        }
        // if it's empty, it passes, if not empty, means there are unmatched pairs
        return braces.isEmpty(); 
    }
}
