public class AdvanceRecursion {
    public static void TowerOfHanoi(int n, String s, String h, String d){
        if(n == 1){
            System.out.println("transwer disk "+ n +  " From " + s + " to "+ d);
            return;
        }
        TowerOfHanoi(n-1, s, d, h);
        System.out.println("transwer disk "+ n + " From " + s + " to "+ d);
        TowerOfHanoi(n-1, h, s, d);
    }
    static void printStringInReverse(String s){
        if(s.length() == 0){
            return;
        }
        System.out.print(s.charAt(s.length()-1));
        printStringInReverse(s.substring(0, s.length()-1));
    }

    static boolean isArraySorted(int[] a, int i){
        if(i == a.length-1){
            return true;
        }

        if(a[i] >= a[i+1]){
            return false;
        }

        return isArraySorted(a, i+1);
    }

    static void getLastOccurance(String s, int f, int l, char c, int i){
        if(s.length() <= i){
            System.out.println(f+" "+ l);
            return;
        }
        if(s.charAt(i) == c){
            if(f == -1){
                f=i;
                l=i;
            }else{
                l=i;
            }
        }
        getLastOccurance(s, f, l, c, i+1);
    }
    static String moveAllXToEnd(String s, int i, int c){
        if(i >= s.length()){
            for(int j = 0; j < c; j++){
                s+='x';
            }
            return s;
        }

        if(s.charAt(i) == 'x'){
            return moveAllXToEnd(s.substring(0, i)+s.substring(i+1, s.length()), i,c+1);
        }else{
            return moveAllXToEnd(s, i+1,c);
        }
    }

    static String uniqueCharacter(String s, int i, int[] a){

        if(i >= s.length()){
            return s;
        }

        if(a[s.charAt(i)-'a'] == 1){
            return uniqueCharacter(s.substring(0, i)+s.substring(i+1, s.length()), i, a);
        }else{
            a[s.charAt(i)-'a'] = 1;
            return uniqueCharacter(s, i+1, a);
        }

    }

    static void PrintSubString(String s, int i, String ans){
        if(i >= s.length()){
            if(ans != "")
                System.out.println(ans);
            return;
        }
        PrintSubString(s, i+1, ans);
        PrintSubString(s, i+1, ans+s.charAt(i));
    }

    public static void main(String[] args) {
        int n = 3;
//        TowerOfHanoi(n, "S", "H", "D");
//        String sk = "Satyam Katiyar";
//        printStringInReverse(sk);
//        getLastOccurance("babbabbaab", -1, -1, 'a', 0);
//            int a[] = {1,2,3,4,5};
//            System.out.println(isArraySorted(a, 0));
//        System.out.println(moveAllXToEnd("xxaaaxxaa",  0, 0));
//        int[] a = new int[26];
//        System.out.println(uniqueCharacter("aadsddaaabbbb", 0, a));
        PrintSubString("abc", 0, "");
    }
}
