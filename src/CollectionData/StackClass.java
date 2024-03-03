package CollectionData;


public class StackClass {
    static class Node {
        int data;
        Node next;
        public Node(int n){
            this.data = n;
            this.next = null;
        }
    }

    static class stack {
        public Node head;
        public int size=0;

        public void push(int n){
            Node newNode = new Node(n);
            if(head == null){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void peek(){
            if(head == null){
                System.out.println("Stack is Empty");
            }else{
                System.out.println(head.data);
            }
        }

        public void pop(){
            if(head == null){
                System.out.println("Stack is Empty");
            }else{
                System.out.println(head.data);
                head = head.next;
            }
            size--;
        }
    }


    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.pop();
        s.peek();


    }

}
