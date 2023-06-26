package bt05;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        String str = "123123";
        Queue<Character> queue = new ArrayDeque<>();
        str = str.replaceAll(" ","");
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            queue.offer(character);
        }
        System.out.println(queue);
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = queue.poll() + reverseString;
        }
        System.out.println(reverseString);
        if (str.equals(reverseString))
            System.out.println("isPalindrome ");
        else
            System.out.println("notPalindrome");
    }
    }


