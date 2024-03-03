import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'S');
        System.out.println(sb);
        sb.insert(0, 'T');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.append(" Jai Shri Ram");
        System.out.println(sb);
        System.out.println(sb.length()  );
    }
}
