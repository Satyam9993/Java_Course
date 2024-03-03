package CollectionData;
import java.util.*;

public class StackBuiltIn {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}
