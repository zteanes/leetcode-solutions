import java.util.Stack;

public class validParentheses{
     public static boolean isValid(String s){
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
    public static void main(String[] args) {
        // define our test cases
        String test1 = "()"; // valid
        String test2 = "()[]{}"; // valid
        String test3 = "(]"; // invalid
        String test4 = "([)]"; // invalid
        String test5 = "{[]}"; // valid

        // print out results
        System.out.println("Test 1: " + isValid(test1)); // should print true
        System.out.println("Test 2: " + isValid(test2)); // should print true
        System.out.println("Test 3: " + isValid(test3)); // should print false
        System.out.println("Test 4: " + isValid(test4)); // should print false
        System.out.println("Test 5: " + isValid(test5)); // should print true
    }
}
