// import java.util.Stack;

// public class CountingBits{
//     public static int binary(int n){
//         // Stack<Integer>st=new Stack<>();
//         // while (n>0) {
//         //     st.push(n%2);
//         //     n/=2;
//         // }
//         // int num=0;
//         // while (!st.isEmpty()) {
//         //     num*=10;
//         //     num+=st.pop();
//         // }
//         // return num;
//         int c=0;
//         while (n>0) {
//             if(n%2==0){
//                 c++;
//             }
//             n/=2;
//         }
//         return c;
//     }
//     public static int[] countBits(int n) {
//         int []arr = new int[n+1];
//         for(int i=0;i<=n;i++){
//             arr[i]=binary(i);
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int [] arr = countBits(10);
//         for(int i=0;i<arr.length;i++){
//             System.out.println(i+"->"+arr[i]);
//         }
//     }
// }