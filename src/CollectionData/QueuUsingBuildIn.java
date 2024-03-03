package CollectionData;

import java.util.*;

public class QueuUsingBuildIn {
    static class Q {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static void add(int v){
            if(s1.isEmpty()){
                s1.add(v);
            }else{
                while(!s1.isEmpty()){
                    s2.add(s1.pop());
                }
                s1.push(v);
                while(!s2.isEmpty()){
                    s1.add(s2.pop());
                }
            }
        }

        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                return s1.pop();
            }
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                return s1.peek();
            }
        }

        public static void display(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
            }else{
                for(int s: s1){
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
//            Q q = new Q();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

//            q.display();
            System.out.println(q.remove());
            System.out.println(q.remove());
            System.out.println(q.remove());
            System.out.println(q.peek());
//            q.display();
    }
}
