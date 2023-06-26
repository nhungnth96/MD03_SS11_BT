package bt04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập vào số lượng từ: ");
        int numberOfWord = new Scanner(System.in).nextInt();
        for (int i = 1; i <= numberOfWord; i++) {
            System.out.printf("Nhập từ thứ "+i+": ");
            String word = new Scanner(System.in).nextLine();
            stack.push(word);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.printf(stack.pop()+" "); // reversed stack
        }
    }
}
