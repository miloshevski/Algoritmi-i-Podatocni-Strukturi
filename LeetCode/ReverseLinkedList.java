
import java.util.Scanner;
///ZA DADENA LISTA 1->2->3 DA SE PREVRTI VO 3->2->1
public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next=new ListNode(4);
        ListNode it = head;
        while (it!=null) {
            System.out.print(it.val+"->");
            it=it.next;
        }
        System.out.println();
        ListNode it2 = reverseList(head);
        while (it2!=null) {
            System.out.print(it2.val+"->");
            it2=it2.next;
        }
        sc.close();
    }
}
