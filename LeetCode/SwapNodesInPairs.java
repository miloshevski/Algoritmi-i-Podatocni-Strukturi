// import java.util.List;
// public class SwapNodesInPairs {
   
    
// class Solution {
//     public static ListNode swapPairs(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         dummy.next=head;
//         ListNode tmp=dummy;
//         ListNode node1;
//         ListNode node2;
//         while(tmp.next!=null&&tmp.next.next!=null){
//             node1=tmp.next;
//             node2=tmp.next.next;
//             node1.next=node2.next;
//             node2.next=node1;
//             tmp.next=node2;
//             tmp=node1;
//         }
//         return dummy.next;
//     }
// }
//     public static void main(String[] args) {
//         ListNode head=new ListNode(1);
//         head.next=new ListNode(2);
//         head.next.next=new ListNode(3);
//         head.next.next.next=new ListNode(4);
//         ListNode it=swapPairs(head);
//     }
// }
