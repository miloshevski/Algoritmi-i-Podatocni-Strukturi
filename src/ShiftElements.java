import java.util.Scanner;

public class ShiftElements {
    public static class DLL<E> {
        private DLLNode<E> first, last;
    
        public DLL() {
            // Construct an empty DLL
            this.first = null;
            this.last = null;
        }
    
        public void insertFirst(E o) {
            DLLNode<E> ins = new DLLNode<E>(o, null, first);
            if (first == null)
                last = ins;
            else
                first.pred = ins;
            first = ins;
        }
    
        public void insertLast(E o) {
            if (first == null)
                insertFirst(o);
            else {
                DLLNode<E> ins = new DLLNode<E>(o, last, null);
                last.succ = ins;
                last = ins;
            }
        }
    
        public void insertAfter(E o, DLLNode<E> after) {
            if (after == last) {
                insertLast(o);
                return;
            }
            DLLNode<E> ins = new DLLNode<E>(o, after, after.succ);
            after.succ.pred = ins;
            after.succ = ins;
        }
    
        public void insertBefore(E o, DLLNode<E> before) {
            if (before == first) {
                insertFirst(o);
                return;
            }
            DLLNode<E> ins = new DLLNode<E>(o, before.pred, before);
            before.pred.succ = ins;
            before.pred = ins;
        }
    
        public E deleteFirst() {
            if (first != null) {
                DLLNode<E> tmp = first;
                first = first.succ;
                if (first != null) first.pred = null;
                if (first == null)
                    last = null;
                return tmp.element;
            } else
                return null;
        }
    
        public E deleteLast() {
            if (first != null) {
                if (first.succ == null)
                    return deleteFirst();
                else {
                    DLLNode<E> tmp = last;
                    last = last.pred;
                    last.succ = null;
                    return tmp.element;
                }
            } else
                return null;
        }
    
        public E delete(DLLNode<E> node) {
            if (node == first) {
                return deleteFirst();
            }
            if (node == last) {
                return deleteLast();
            }
            node.pred.succ = node.succ;
            node.succ.pred = node.pred;
            return node.element;
    
        }
    
        public DLLNode<E> find(E o) {
            if (first != null) {
                DLLNode<E> tmp = first;
                while (!tmp.element.equals(o) && tmp.succ != null)
                    tmp = tmp.succ;
                if (tmp.element.equals(o)) {
                    return tmp;
                } else {
                    System.out.println("The element does not exist in the list");
    //                System.out.println("Elementot ne postoi vo listata");
                }
            } else {
                System.out.println("The list is empty");
    //            System.out.println("Listata e prazna");
            }
            return null;
        }
    
        public void deleteList() {
            first = null;
            last = null;
        }
    
        public int getSize() {
            int listSize = 0;
            DLLNode<E> tmp = first;
            while(tmp != null) {
                listSize++;
                tmp = tmp.succ;
            }
            return listSize;
        }
    
        @Override
        public String toString() {
            String ret = new String();
            if (first != null) {
                DLLNode<E> tmp = first;
                ret += tmp.toString();
                while (tmp.succ != null) {
                    tmp = tmp.succ;
                    ret += "<->" + tmp.toString();
                }
            } else {
                ret = "Empty list!!!";
    //            ret = "Prazna lista!!!";
            }
            return ret;
        }
    
        public String toStringR() {
            String ret = new String();
            if (last != null) {
                DLLNode<E> tmp = last;
                ret += tmp.toString();
                while (tmp.pred != null) {
                    tmp = tmp.pred;
                    ret += "<->" + tmp.toString();
                }
            } else {
                ret = "Empty list!!!";
    //            ret = "Prazna lista!!!";
            }
            return ret;
        }
    
        public DLLNode<E> getFirst() {
            return first;
        }
    
        public DLLNode<E> getLast() {
    
            return last;
        }
    
        public void mirror() {
    
            DLLNode<E> tmp = null;
            DLLNode<E> current = first;
            last = first;
            while(current!=null) {
                tmp = current.pred;
                current.pred = current.succ;
                current.succ = tmp;
                current = current.pred;
            }
    
            if(tmp!=null && tmp.pred!=null) {
                first=tmp.pred;
            }
        }
    }
    public static class DLLNode<E> {
        protected E element;
        protected DLLNode<E> pred, succ;
        public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
            this.element = elem;
            this.pred = pred;
            this.succ = succ;
        }
    
        @Override
        public String toString() {
            return element.toString();
        }
    }
    public static <E> DLL<E> shift(DLL<E> list, int k){
        int size=list.getSize();
        DLL<E> newList = new DLL<E>();
        for(int i=0;i<k;i++){
            newList.insertFirst(list.deleteLast());
        }
        for(int i=0;i<size-k;i++){
            newList.insertLast(list.deleteFirst());
        }
        System.out.println(newList);
        return newList;
    }
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.insertLast(sc.nextInt());
        }
        System.out.println(list.toString());
        for(int i=0;i<10;i++){
            shift(list, i);
        }
        sc.close();
    }
}
