public class Recursion {
    static int sumofn(int n){
        if(n==0) return 0;
        return  sumofn(n-1) + n;
    }

    static int factorial(int n){
        if(n <= 1){
            return  1;
        }
        return  n * factorial(n-1);
    }

    static void fibonachi(int a, int b, int n){
        if(n == 0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonachi(b, c, n-1);
    }

    static int powerN(int n, int x){
        if (n == 1) return x;
        return x * powerN(n-1, x);
    }
    public static void main(String[] args) {
//        fibonachi(0, 1, 10);
        System.out.println(powerN(4, 2));
    }
}
