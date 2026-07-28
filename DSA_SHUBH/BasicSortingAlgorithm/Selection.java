import java.util.*;
public class Selection {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minP = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minP]<arr[j]){
                    minP = j;
                }
            }
            // swap
                    int temp = arr[i];
                    arr[i] = arr[minP];
                    arr[minP] = temp;
        }
    }

    public static void printarr(int arr[]){
        sort(arr);
        System.out.print("Sorted Array(Selection): [ ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        printarr(arr);
    }
    
}
