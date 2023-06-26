package bt09;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // integer
        Stack<Integer> stack = new Stack<>();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random()*100);
            numberList.add(i,number);
            stack.push(number);
        }
        System.out.println(stack);
        Stack<Integer> rStack = new Stack<>();
        for(Integer integer:numberList){
            rStack.push(stack.pop());
        }
        System.out.println(rStack);

        // string
        Stack<Character> strStack = new Stack<>();
        String str = "hello world";
        str = str.replaceAll(" ","");
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            strStack.push(character);
        }
        System.out.println(strStack);
        Stack<Character> rStr = new Stack<>();
        Stack<Character> temp = new Stack<>();
        temp.addAll(strStack);
        for(Character character:temp){
            rStr.push(strStack.pop());
        }
        System.out.println(rStr);
    }

}
