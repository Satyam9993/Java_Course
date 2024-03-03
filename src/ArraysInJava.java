import java.util.*;

public class ArraysInJava {
    public static int linearSearch(int[] arr, int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==k)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of An Array");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("============================================");
        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("============================================");

//        for(int i : marks){
//            System.out.println(i);
//        }
        System.out.print("Enter The Integer Which You Want To Search: ");
        int searchKey = sc.nextInt();
        int idx = linearSearch(marks, searchKey);
        if(idx!= -1){
            System.out.println("Given Integer is Present at Index " + idx);
        }else{
            System.out.println("Given Integer is Not Present");
        }
    }
}
