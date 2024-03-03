public class GCD_MATH {

    static int gcd(int a, int b){
        if(b!=0)
            return gcd(b, a%b);
        else
            return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(10, 3));
    }
}
