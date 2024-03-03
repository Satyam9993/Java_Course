public class bitManipulation {

    static int getSecBit(int n){
        n = n>>2;
        return  (n&1)==1?1:0;
    }

    static int setBitN(int n, int i){
        return (n | 1 << (i-1));
    }



    public static void main(String[] args) {
        System.out.println(clearBitN(5, 1)); // 101
    }
    static int clearBitN(int n, int i){
        int x = 1 << (i-1);
        x = ~x;
        return n&x;
    }
}
