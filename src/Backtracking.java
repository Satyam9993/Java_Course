import java.util.*;

public class Backtracking{
    public static void printPurmutation(String s, String ans, int idx){

        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < s.length(); i++){
            printPurmutation(s.substring(0, i)+s.substring(i+1, s.length()), ans+s.charAt(i), idx+1);
        }

    }

    public static void nQueen(int n){

    }

    public static void main(String[] args){
        printPurmutation("ABC", "",  0);
    }
}