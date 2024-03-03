public class MergeSort {

    static void merger(int[] a, int l, int m, int r){
        int l_s = m-l+1;
        int r_s = r-m;
        int[] L = new int[l_s];
        int[] R = new int[r_s];

        for(int i=0;i<l_s;i++){
            L[i] = a[l+i];
        }

        for(int j=0;j<r_s;j++){
            R[j] = a[m+j+1];
        }

        int i = 0, j = 0, k=l;

        while(i < l_s && j < r_s){
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }else{
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < l_s){
            a[k] = L[i];
            i++;
            k++;
        }

        while(j < r_s){
            a[k] = R[j];
            j++;
            k++;
        }

    }
    static void mergerSort(int[] a, int l, int r){
        if(l < r){
            int m = l + (r -l) / 2;
            mergerSort(a, l, m);
            mergerSort(a, m+1, r);

            merger(a, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] a = {4,3,13,2,1};
        mergerSort(a, 0, a.length-1);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
