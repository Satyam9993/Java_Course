import java.util.*;
public class StringJava {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Name: ");
//        String name = sc.nextLine();
//        System.out.println("Welcome "+ name);

        // Fns in String

        // String Concatination
        String fName = "Satyam";
        String LName = "Katiyar";
        String Full_Name = fName + " " + LName;
        System.out.println(Full_Name);


        // Length
        System.out.println(Full_Name.length());

        // Get Perticular Index
        System.out.println(Full_Name.charAt(1));


        // Split Array With Delimeter and Gives Array
        System.out.println(Full_Name.split(" ")[0]);

        // String Compare
        String a = "Satyam";
        String b = "Satyam";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b)); // a > b return postive value // a == b return 0 // a < b return negitive Value
        System.out.println(new String("Tony") == new String("Tony"));


        // Substring
        String s = "My Name is Satyam Katiyar";
        System.out.println(s.substring(0, 9));
        System.out.println(s.substring(0));
    }
}
