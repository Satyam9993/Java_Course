public class QuickSort {
    static int partition(int[] a, int l, int h){

        int p = a[h];
        int i = l-1;
        for(int j = l; j < h; j++){
            if(a[j] < p){
                i++;
                // swap
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        i++;
        int t=a[i];
        a[i] = p;
        a[h] = t;
        return i;
    }
    static void quickSort(int[] a, int l, int h){
        if(l < h){
            int p = partition(a, l, h);
            quickSort(a, l, p-1);
            quickSort(a, p+1, h);
        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,43,1,4,0, -99};
        int n = a.length;
        quickSort(a, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
