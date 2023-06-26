package bt10;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String str = "34+2*";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                // Nếu ký tự là một số, đưa nó vào stack
                stack.push(Integer.valueOf((c)));
                System.out.println(stack);
            } else {
                // Nếu ký tự là một toán tử, lấy hai số trên đỉnh của stack và thực hiện phép tính tương ứng
                int top2 = stack.pop();
                int top1 = stack.pop();
                int result = calculator(top1, c, top2);
                stack.push(result);
            }
        }
    }

    public static int calculator(int operand1, char operator, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
