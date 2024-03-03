public class Sorting {

    static void bubbleSort(int[] a){
        for(int i = 0; i < a.length-1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j+1]){
                    int t = a[j];
                    a[j] =a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }

    static void selectionSort(int[] a){
        for(int i = 0; i < a.length-1; i++){
            int m = i;
            for(int j = i; j < a.length; j++){
                if(a[m] >= a[j]){
                    m = j;
                }
            }

            int t = a[i];
            a[i] = a[m];
            a[m] = t;
        }
    }

    static void insertionSort(int[] a){
        for(int  i = 1; i < a.length; i++){
            int j = i-1;
            int curr = a[i];

            while(j >= 0 && curr < a[j]){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] a = {111,5, 3, 2, 3, 4};
        insertionSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
