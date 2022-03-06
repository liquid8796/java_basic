
import java.util.Arrays;

public class draft {
    public static void printList(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println("");
    }
    public static void merge(int[] S1, int[] S2, int[] S){
        int i = 0, j = 0;
        while(i + j < S.length){
            if(j == S2.length || (i < S1.length && S1[i] < S2[j]))
                S[i+j] = S1[i++];
            else
                S[i+j] = S2[j++];
        }
        printList(S);
    }
    public static void mergeSort(int[] S){
        int n = S.length;
        if(n < 2) return;
        int mid = n/2;
        int[] S1 = Arrays.copyOfRange(S, 0, mid);
        int[] S2 = Arrays.copyOfRange(S, mid, n);
        mergeSort(S1);
        mergeSort(S2);
        merge(S1, S2, S);
    }
    public static void main(String[] args) {        
        int[] list = {1,3,8,9,15,20,18,17,7,4,0};
        int[] a = new int[]{1, 3};
        for (int x:
             a) {
            System.out.println(x);
        }

    }

}
