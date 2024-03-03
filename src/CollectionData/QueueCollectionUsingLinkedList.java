package CollectionData;

public class QueueCollectionUsingLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    static class Queue1{
        Node front;
        Node rear;
        int size;

        Queue1(){
            front = null;
            rear = null;
            size = 0;
        }

        public void add(int val){
            Node newNode = new Node(val);
            if(front == null && rear == null){
                front = newNode;
                rear = newNode;
            }else{
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        public int size(){
            return size;
        }

        public int remove(){
            if(front == null && rear == null){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                int res = front.val;
                front = front.next;
                if(front == null){
                    rear = null;
                }
                size--;
                return res;
            }
        }

        public int peek(){
            if(front == null && rear == null){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                return front.val;
            }
        }

        public void display(){
            if(front == null && rear == null){
                System.out.println("Queue is Empty");
            }else{
                Node t = front;
                while(t!= null){
                    System.out.print(t.val + " ");
                    t=t.next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.size());
    }
}
