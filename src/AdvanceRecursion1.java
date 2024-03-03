public class AdvanceRecursion1 {
    static void PrintSubString(String s, String permutation){
        if(s.length()  == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < s.length(); i ++){
            PrintSubString(s.substring(0, i)+s.substring(i+1, s.length()), permutation+s.charAt(i));
        }
    }

    static int magePathCount(int n, int m, int i, int j){
        if(i == n-1 && j == m-1){
            return  1;
        }

        if(i >= n || j >= m){
            return 0;
        }

        return magePathCount(n, m, i, j+1) + magePathCount(n, m, i+1, j);
    }

    static int placeTiles(int n, int m){

        if(n<m){
            return 1;
        }
        if(n == m){
            return 2;
        }

        // Verticle
        int verticlePlace = placeTiles(n-m, m);

        // horizontal
        int horizontalPlace = placeTiles(n-1, m);

        return horizontalPlace+verticlePlace;

    }

    static int getAllGuest(int n){
        if(n <= 1){
            return 1;
        }

        // way 1
        int w1 = getAllGuest(n-1);

        // way 2
        int w2 = (n-1)*getAllGuest(n-2);

        return w1+w2;
    }

    static void printSubSet(int n, int i, String ans){
        if(n == 0){
            System.out.println("== "+ans);
            return;
        }

        // Include it
        printSubSet(n-1, i+1, ans+n);

        // NotInclude It

        printSubSet(n-1, i+1, ans);
    }

    public static void main(String[] args) {
//        PrintSubString("abc", "");
//        System.out.println(magePathCount(3, 4, 0, 0));
//        System.out.println(placeTiles(4, 2));
//        System.out.println(getAllGuest(4));
        printSubSet(3, 0, "");
    }
}
