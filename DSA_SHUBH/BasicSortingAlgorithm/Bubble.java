import java.util.*;
public class Bubble {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            //outer loop for turns
            for(int j=0;j<arr.length-1-i;j++){
                // inner loop  n-1-turns
                if(arr[j]<arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        sort(arr);
        System.out.print("Sorted Array(Bubble): [ ");
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