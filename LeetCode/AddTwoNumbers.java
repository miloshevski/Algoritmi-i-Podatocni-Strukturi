import java.util.Scanner;
import java.util.Stack;

public class AddTwoNumbers {
    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Push values of l1 into stack1
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        // Push values of l2 into stack2
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        ListNode result = null;
        int carry = 0;

        // Process both stacks
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int sum = carry;
            if (!stack1.isEmpty()) sum += stack1.pop();
            if (!stack2.isEmpty()) sum += stack2.pop();

            carry = sum / 10;

            // Add the current digit to the front of the result list
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = result;
            result = newNode;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first list
        System.out.print("Enter number of nodes for l1: ");
        int n = sc.nextInt();
        System.out.println("Enter values for l1:");
        ListNode l1 = null, current = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (l1 == null) {
                l1 = new ListNode(val);
                current = l1;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }

        // Input for second list
        System.out.print("Enter number of nodes for l2: ");
        int m = sc.nextInt();
        System.out.println("Enter values for l2:");
        ListNode l2 = null;
        current = null;
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            if (l2 == null) {
                l2 = new ListNode(val);
                current = l2;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }

        // Add the two numbers
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result
        System.out.print("Resultant List: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        sc.close();
    }
}
