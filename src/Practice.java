import java.sql.SQLOutput;
import java.util.*;
public class Practice {
    public  static int AvgOfThreeNumber(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        return (a+b+c)/3;
    }

    public static int sumOfOdd(){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(i%2 != 0){
                ans += i;
            }
        }
        return  ans;
    }

    public static int getGreaterNumber(int a, int b){
        return  a>b?a:b;
    }

    public static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return  1;
        }

        return  fibo(n-1) + fibo(n-2);
    }

    public static int gcd(int a, int b){
        if(b != 0){
            return  gcd(b, a%b);
        }
        return  a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.print(AvgOfThreeNumber());
//        System.out.println(sumOfOdd());
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(getGreaterNumber(a, b));

//        int n = sc.nextInt();
//        System.out.print(fibo(n));

//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));


        while(n1 != n2) {
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);


    }
}
