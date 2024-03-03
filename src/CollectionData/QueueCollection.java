package CollectionData;

public class QueueCollection {
    static class Q{
        static int[] a;
        static int s;
        static int r = -1;
        Q(int s){
            this.s = s;
            a = new int[s];
        }

        public boolean isEmpty(){
            return r==-1;
        }

        // ADD
        public static void add(int n){
            if (r == s-1){
                System.out.println("Queue is Full");
            }
            r++;
            a[r] = n;
        }

        // Remove

        public static int remove(){
            if (r == -1){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = a[0];
            for(int i = 0; i < r; i++){
                a[i] = a[i+1];
            }
            r--;
            return front;
        }


        public static int peek(){
            if (r == -1){
                System.out.println("Queue is Empty");
                return -1;
            }
            return a[0];
        }

    }

    public static void main(String[] args) {
        Q q = new Q(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println(q.peek());
    }
}
