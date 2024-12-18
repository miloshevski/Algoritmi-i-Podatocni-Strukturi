
//   class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

// public class MergeSortedLists {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode h1=list1;
       
//         ListNode it1=h1;
//         ListNode it2=list2;
//         ListNode list=new ListNode(0);
//         while (it1!=null&&it2!=null) {
//             if(it1.val>it2.val){
//                 list.next=new ListNode(it1.val);
//                 it1=it1.next;
//             }else{
//                 list.next=new ListNode(it2.val);
//                 it2=it2.next;
//             }
//         }
//         return list.next;
//     }
//     public static void main(String[] args) {
//         ListNode head = new ListNode(0);
//         head.next=new ListNode(1);
//         head.next.next=new ListNode(2);


//     }
// }
