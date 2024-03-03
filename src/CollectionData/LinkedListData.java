package CollectionData;

public class LinkedListData {
    class Node {
        int val;
        Node next;

        Node(int v){
            this.val = v;
            this.next = null;
        }
    }

    Node head = new Node(0);

    public void addFirst(int v){
        Node n = new Node(v);
        if(head == null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void addLast(int v){
        Node n = new Node(v);
        if(head == null){
            head = n;
            return;
        }

        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = n;
    }

    void printList(){
        Node t = head;
        while(t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        System.out.println();
    }

    int size(){
        Node t = head;
        int ans = 0;
        while(t!=null){
            ans+=1;
            t=t.next;
        }
        return ans;
    }

    void removeLast(){
        Node t = head;
        if(t == null || t.next == null){
            head = null;
            return;
        }

        while(t.next.next != null){
            t=t.next;
        }

        t.next = null;
    }

    void removeFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    public void reverseLinkedList(){

        if(head == null || head.next == null){
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }

    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    void deleteNode_fromLast(int n, int s){
        if(n <= 0 || n > s){
            System.out.println("Not  Possible");
            return;
        }

        n = s-n-1;

        if(n == -1){
            head = head.next;
            return;
        }

        Node t = head;

        while(n > 0){
            System.out.println(t.val);
            t = t.next;
            n--;
        }

        t.next = t.next.next;
    }

    public static void main(String[] args) {
        LinkedListData list = new LinkedListData();
        list.addFirst(1);
        list.addLast(2);
//        list.removeLast();
//        list.removeLast();
//        list.removeFirst();
        list.addLast(1);
        list.printList();
//        list.reverseLinkedList();
//        list.head = list.reverseRecursive(list.head);

        list.deleteNode_fromLast(1, list.size());
        list.printList();


    }
}
