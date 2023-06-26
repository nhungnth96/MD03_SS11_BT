package bt06;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String bracketPair = "s * (s – a) * (s – b) * (s – c)";
        for (int i = 0; i < bracketPair.length(); i++) {
            char character = bracketPair.charAt(i);
            if(character == '(' || character == '{' || character == '[' ){
                stack.push(character);
            } else if (character == ')' || character == '}' || character == ']' ){
                char top = stack.pop();
                if(top!=character){
                    System.out.println("false");
                }
                if(!stack.isEmpty()){
                    System.out.println("false");
                }
            }
        }
        System.out.println(stack);

    }
}
