package ZadaciOdKurs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class MatematickiIzraz {
    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

      // Function to perform infix to postfix conversion
    static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the scanned character is
            // an operand, add it to the output string.
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
                result.append(c);

            // If the scanned character is
            // an ‘(‘, push it to the stack.
            else if (c == '(')
                st.push('(');

            // If the scanned character is an ‘)’,
            // pop and add to the output string from the stack
            // until an ‘(‘ is encountered.
            else if (c == ')') {
                while (st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); 
            }

            // If an operator is scanned
            else {
                while (!st.isEmpty() && (prec(c) < prec(st.peek()) ||
                                         prec(c) == prec(st.peek()))) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop all the remaining elements from the stack
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        String res = result.toString();
        return res;
    }
    static int evaluatePostfix(String exp)
	{

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			if (Character.isDigit(c))
				stack.push(c - '0');

			else {
				int val1 = stack.pop();
				int val2 = stack.pop();

				switch (c) {
				case '+':
					stack.push(val2 + val1);
					break;
				case '-':
					stack.push(val2 - val1);
					break;
				case '/':
					stack.push(val2 / val1);
					break;
				case '*':
					stack.push(val2 * val1);
					break;
				}
			}
		}
		return stack.pop();
	}
    public static int evaluateExpression(String expression){
        return evaluatePostfix(infixToPostfix(expression));
	}
    public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(evaluateExpression(input.readLine()));
        input.close();
	}
}
